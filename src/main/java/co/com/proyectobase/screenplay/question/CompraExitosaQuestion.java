package co.com.proyectobase.screenplay.question;

import co.com.proyectobase.screenplay.interactions.Wait;
import co.com.proyectobase.screenplay.ui.comprarealizada.CompraRealizadaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.proyectobase.screenplay.hooks.TheActor.actor;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class CompraExitosaQuestion implements Question<Boolean> {
    public String titleOrderFinish;
    public CompraExitosaQuestion(String titleOrderFinish) {
        this.titleOrderFinish = titleOrderFinish;
    }

    @Override
    public Boolean answeredBy(Actor actorr) {
        actor.attemptsTo(
                WaitUntil.the(CompraRealizadaPage.TITLE_LABEL_THANK_ORDER, containsText(titleOrderFinish)).forNoMoreThan(20).seconds()
        );
        Wait.theSeconds(2);
        return true;
    }
    public static Question <Boolean> titleOrderIsVisible  (String titleOrderFinish){
        return new CompraExitosaQuestion(titleOrderFinish);
    }
}
