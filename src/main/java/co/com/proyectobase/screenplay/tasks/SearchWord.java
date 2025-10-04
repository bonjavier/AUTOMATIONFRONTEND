package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SearchWord implements Task {

    private final String palabra;

    public SearchWord(String palabra) {
        this.palabra = palabra;
    }

    public static SearchWord the(String palabra){
        return new SearchWord(palabra);
    }

    @Override
    @Step("{0} buscar la palabra parametrizada")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        );
    }
}
