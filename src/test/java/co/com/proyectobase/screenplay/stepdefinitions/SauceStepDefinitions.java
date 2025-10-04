package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.NavigateTo;

import co.com.proyectobase.screenplay.tasks.login.LoginTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;

public class SauceStepDefinitions {

    @Given("el {word} esta en la pagina de login en Swag Labs")
    public void elUsuarioEstaEnElLogin(String actorNamed){
        actor.assignName(actorNamed);
        actor.attemptsTo(
                NavigateTo.theSwagPage()
        );
    }

    @When("el usuario ingresa los datos de {word} y {word}")
    public void elUsuarioIngresaDatos(String username, String password) {
        actor.attemptsTo(
                LoginTask.conCredenciales(username, password)
        );
    }

    @Then("visualiza el modulo productos")
    public void visualizaElModuloProductos() {
        // Implementar validación del módulo productos
    }

}
