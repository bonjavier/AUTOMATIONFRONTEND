package co.com.proyectobase.screenplay.tasks.login;

import co.com.proyectobase.screenplay.ui.SaucePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask {

    public static Performable conCredenciales(String username, String password) {
        return Task.where("{0} ingresa credenciales de login",
                Enter.theValue(username).into(SaucePage.INPUT_USERNAME),
                Enter.theValue(password).into(SaucePage.INPUT_PASSWORD),
                Click.on(SaucePage.BTN_LOGIN)
        );
    }
}