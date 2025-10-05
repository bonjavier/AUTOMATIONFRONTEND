package co.com.proyectobase.screenplay.tasks.carrito;

import co.com.proyectobase.screenplay.interactions.Wait;
import co.com.proyectobase.screenplay.ui.carrito.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CarritoTask implements Task {

    public static CarritoTask validarInterfazCarrito() {
        return instrumented(CarritoTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("validarInterfazCarrito");
        actor.attemptsTo(
                Wait.theSeconds(2),
                Ensure.that(CarritoPage.SECTION_CART).isDisplayed(),
                Ensure.that(CarritoPage.LOGO).isDisplayed(),
                Ensure.that(CarritoPage.LABEL_PRODUCT_BACKPACK).isDisplayed(),
                Ensure.that(CarritoPage.LABEL_PRODUCT_BIKE).isDisplayed(),
                Ensure.that(CarritoPage.BTN_CONTINUE_SHOPPING).isDisplayed(),
                Ensure.that(CarritoPage.BTN_CHECKOUT).isDisplayed(),
                Click.on(CarritoPage.BTN_CHECKOUT)
        );
    }
}