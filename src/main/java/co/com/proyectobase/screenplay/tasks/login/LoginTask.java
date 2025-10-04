package co.com.proyectobase.screenplay.tasks.login;

import co.com.proyectobase.screenplay.ui.login.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask {

    public static Performable conCredenciales(String username, String password) {
        return Task.where("{0} ingresa credenciales de login",
                Enter.theValue(username).into(LoginPage.INPUT_USERNAME),
                Enter.theValue(password).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }
}