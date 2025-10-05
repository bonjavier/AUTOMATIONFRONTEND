package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.question.CompraExitosaQuestion;
import co.com.proyectobase.screenplay.tasks.NavigateTo;

import co.com.proyectobase.screenplay.tasks.carrito.CarritoTask;
import co.com.proyectobase.screenplay.tasks.comprarealizada.CompraRealizadaTask;
import co.com.proyectobase.screenplay.tasks.confirmarcompra.ConfirmaCompraTask;
import co.com.proyectobase.screenplay.tasks.datospersonales.DatosPersonalesTask;
import co.com.proyectobase.screenplay.tasks.home.HomeTask;
import co.com.proyectobase.screenplay.tasks.login.LoginTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SauceStepDefinitions {

    @Given("el {word} esta en la pagina de login en Swag Labs")
    public void elUsuarioEstaEnElLogin(String actorNamed) {
        actor.assignName(actorNamed);
        actor.attemptsTo(
                NavigateTo.theSwagPage()
        );
    }

    @When("el usuario ingresa los datos de {word} y {word}")
    public void elUsuarioIngresaDatos(String username, String password) {
        actor.attemptsTo(
                LoginTask.loginConCredenciales(username, password)
        );
    }

    @Then("visualiza y agrega los productos al carrito")
    public void visualizaElModuloProductos() {
        actor.attemptsTo(
                HomeTask.validarInterfazProducts()
        );
    }


    @And("procede al checkout")
    public void procederCheckout() {
        actor.attemptsTo(
                CarritoTask.validarInterfazCarrito()
        );
    }

    @And("ingresa sus datos de envío y finaliza la compra:")
    public void ingresarDatosDeEnvio(DataTable dataTable) {
        String nombre = dataTable.asMaps().get(0).get("nombre");
        String apellido = dataTable.asMaps().get(0).get("apellido");
        String codigoPostal = dataTable.asMaps().get(0).get("codigoPostal");

        actor.attemptsTo(
                DatosPersonalesTask.validarDatosPersonales(nombre, apellido, codigoPostal)
        );
    }

    @And("confirma la compra")
    public void confirmaCompra() {
        actor.attemptsTo(
                ConfirmaCompraTask.validarInterfazConfirmarCompra()
        );
    }

    @Then("visualiza el mensaje de confirmación {string}")
    public void validarConfirmacion(String mensaje) {
        actor.should(
                seeThat(CompraExitosaQuestion.titleOrderIsVisible(mensaje))
        );
        actor.attemptsTo(
                CompraRealizadaTask.validarInterfazCompraRealizada()
        );
    }

}
