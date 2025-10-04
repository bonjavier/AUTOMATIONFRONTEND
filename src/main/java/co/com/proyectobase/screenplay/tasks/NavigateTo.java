package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theSwagPage(){
        return Task.where("{0} opens the google page",
                Open.browserOn().thePageNamed("LoginSwagLabs.page")
                );
    }
}
