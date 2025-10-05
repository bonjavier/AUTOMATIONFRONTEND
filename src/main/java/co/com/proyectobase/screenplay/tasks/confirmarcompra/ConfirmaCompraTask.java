package co.com.proyectobase.screenplay.tasks.confirmarcompra;

import co.com.proyectobase.screenplay.interactions.ScrollTop;
import co.com.proyectobase.screenplay.interactions.Wait;
import co.com.proyectobase.screenplay.ui.confirmarcompra.ConfirmarCompraPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmaCompraTask implements Task {

    public static ConfirmaCompraTask validarInterfazConfirmarCompra() {
        return instrumented(ConfirmaCompraTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("validarInterfazConfirmarCompra");
        actor.attemptsTo(
                Wait.theSeconds(2),
                Ensure.that(ConfirmarCompraPage.SECTION_CONFIRMAR_COMPRA).isDisplayed(),
                Ensure.that(ConfirmarCompraPage.LOGO).isDisplayed(),
                Ensure.that(ConfirmarCompraPage.LABEL_PRODUCT_BACKPACK).isDisplayed(),
                Ensure.that(ConfirmarCompraPage.LABEL_PRODUCT_BIKE).isDisplayed(),
                Ensure.that(ConfirmarCompraPage.BTN_CANCEL).isDisplayed(),
                Ensure.that(ConfirmarCompraPage.BTN_FINISH).isDisplayed(),
                ScrollTop.pagina("window.scrollBy(0, 500);"),
                Wait.theSeconds(2),
                Click.on(ConfirmarCompraPage.BTN_FINISH)
        );
    }
}