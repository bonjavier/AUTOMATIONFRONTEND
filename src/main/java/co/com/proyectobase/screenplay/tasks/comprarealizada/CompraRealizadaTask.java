package co.com.proyectobase.screenplay.tasks.comprarealizada;

import co.com.proyectobase.screenplay.interactions.Wait;
import co.com.proyectobase.screenplay.ui.comprarealizada.CompraRealizadaPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompraRealizadaTask implements Task {

    public static CompraRealizadaTask validarInterfazCompraRealizada() {
        return instrumented(CompraRealizadaTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("validarInterfazCompraRealizada");
        actor.attemptsTo(
                Wait.theSeconds(2),
                Ensure.that(CompraRealizadaPage.SECTION_COMPRA_REALIZADA).isDisplayed(),
                Ensure.that(CompraRealizadaPage.LOGO).isDisplayed(),
                Ensure.that(CompraRealizadaPage.SUBTITLE_LABEL_THANK_ORDER).isDisplayed(),
                Ensure.that(CompraRealizadaPage.BTN_BACK_HOME).isDisplayed(),
                Click.on(CompraRealizadaPage.BTN_BACK_HOME)
        );
    }
}