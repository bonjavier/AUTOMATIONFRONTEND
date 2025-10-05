package co.com.proyectobase.screenplay.ui.datospersonales;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target SECTION_CHECKOUT = Target.the("section checkout")
            .located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

    public static final Target LOGO = Target.the("logo")
            .located(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));

    public static final Target INPUT_FIRST_NAME = Target.the("imput first name")
            .located(By.id("first-name"));

    public static final Target INPUT_LAST_NAME = Target.the("imput last name")
            .located(By.id("last-name"));

    public static final Target INPUT_POSTAL_CODE = Target.the("imput postal code")
            .located(By.id("postal-code"));

    public static final Target BTN_CANCEL = Target.the("boton cancelar")
            .located(By.id("cancel"));

    public static final Target BTN_CONTINUE = Target.the("boton continuar")
            .located(By.id("continue"));
}
