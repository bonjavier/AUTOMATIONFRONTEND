package co.com.proyectobase.screenplay.ui.home;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target SECTION_PRODUCT = Target.the("section product")
            .located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

    public static final Target LOGO = Target.the("logo")
            .located(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));

    public static final Target BTN_ADDTOCARD_BACKPACK = Target.the("add to card backpack")
            .located(By.name("add-to-cart-sauce-labs-backpack"));

    public static final Target BTN_ADDTOCARD_BIKE_LIGHT = Target.the("add to card bike light")
            .located(By.name("add-to-cart-sauce-labs-bike-light"));

    public static final Target BTN_MENU_HAMBURGUESA = Target.the("menu hamburguesa")
            .located(By.id("react-burger-menu-btn"));

    public static final Target BTN_CARRITO = Target.the("boton carrito")
            .located(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));

}
