package co.com.proyectobase.screenplay.tasks.datospersonales;

import co.com.proyectobase.screenplay.interactions.Wait;
import co.com.proyectobase.screenplay.ui.datospersonales.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosPersonalesTask implements Task {

    private final String firstname;
    private final String lastname;
    private final String postalcode;

    public DatosPersonalesTask(String firstname, String lastname, String postalcode) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.postalcode = postalcode;
    }

    public static DatosPersonalesTask validarDatosPersonales(String firstname, String lastname, String postalcode) {
        return instrumented(DatosPersonalesTask.class, firstname, lastname, postalcode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("validarDatosPersonales");
        actor.attemptsTo(
                Wait.theSeconds(2),
                Ensure.that(CheckoutPage.SECTION_CHECKOUT).isDisplayed(),
                Ensure.that(CheckoutPage.LOGO).isDisplayed(),
                Ensure.that(CheckoutPage.INPUT_FIRST_NAME).isDisplayed(),
                Ensure.that(CheckoutPage.INPUT_LAST_NAME).isDisplayed(),
                Ensure.that(CheckoutPage.INPUT_POSTAL_CODE).isDisplayed(),
                Ensure.that(CheckoutPage.BTN_CANCEL).isDisplayed(),
                Ensure.that(CheckoutPage.BTN_CONTINUE).isDisplayed(),
                Click.on(CheckoutPage.INPUT_FIRST_NAME),
                Enter.theValue(firstname).into(CheckoutPage.INPUT_FIRST_NAME),
                Click.on(CheckoutPage.INPUT_LAST_NAME),
                Enter.theValue(lastname).into(CheckoutPage.INPUT_LAST_NAME),
                Click.on(CheckoutPage.INPUT_POSTAL_CODE),
                Enter.theValue(postalcode).into(CheckoutPage.INPUT_POSTAL_CODE),
                Click.on(CheckoutPage.BTN_CONTINUE)
        );
    }
}