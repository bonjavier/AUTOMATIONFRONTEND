package co.com.proyectobase.screenplay.tasks.home;

import co.com.proyectobase.screenplay.interactions.Wait;
import co.com.proyectobase.screenplay.ui.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {

    public static HomeTask validarInterfazProducts() {
        return instrumented(HomeTask.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("validarInterfazProducts");
        actor.attemptsTo(

                Wait.theSeconds(2),
                Ensure.that(HomePage.SECTION_PRODUCT).isDisplayed(),
                Ensure.that(HomePage.LOGO).isDisplayed(),
                Ensure.that(HomePage.BTN_ADDTOCARD_BACKPACK).isDisplayed(),
                Ensure.that(HomePage.BTN_ADDTOCARD_BIKE_LIGHT).isDisplayed(),
                Ensure.that(HomePage.BTN_MENU_HAMBURGUESA).isDisplayed(),
                Ensure.that(HomePage.BTN_CARRITO).isDisplayed(),
                Click.on(HomePage.BTN_ADDTOCARD_BACKPACK),
                Click.on(HomePage.BTN_ADDTOCARD_BIKE_LIGHT),
                Click.on(HomePage.BTN_CARRITO)
        );
    }
}