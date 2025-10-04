package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;

public class SauceStepDefinitions {

    @Given("el {string} esta en la pagina de login en Swag Labs")
    public void elUsuarioEstaEnElLogin(String actorNamed){
        actor.assignName(actorNamed);
        actor.attemptsTo(
                NavigateTo.theSwagPage()
        );
    }

    @When("el usuario ingresa los datos de {usuario} y {password}")
    public void elUsuarioBuscaLaPalabraColombia() {
    }

    @Then("el usuario deberia ver la palabra {word}")
    public void elUsuarioDeberiaVerLaPalabraColombia(String resultado) {

    }

}
