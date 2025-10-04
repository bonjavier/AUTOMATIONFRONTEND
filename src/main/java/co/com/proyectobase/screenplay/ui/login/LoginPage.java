package co.com.proyectobase.screenplay.ui.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target INPUT_USERNAME = Target.the("input username")
            .located(By.name("user-name"));

    public static final Target INPUT_PASSWORD = Target.the("input password")
            .located(By.name("password"));

    public static final Target BTN_LOGIN = Target.the("Login button")
            .located(By.name("login-button"));
}
