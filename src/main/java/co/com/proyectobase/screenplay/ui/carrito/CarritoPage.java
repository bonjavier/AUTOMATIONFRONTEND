package co.com.proyectobase.screenplay.ui.carrito;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {

    public static final Target SECTION_CART = Target.the("section cart")
            .located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

    public static final Target LOGO = Target.the("logo")
            .located(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));

    public static final Target LABEL_PRODUCT_BACKPACK = Target.the("producto backpack")
            .located(By.xpath("//*[@id=\"item_4_title_link\"]/div"));

    public static final Target LABEL_PRODUCT_BIKE = Target.the("producto bike")
            .located(By.xpath("//*[@id=\"item_0_title_link\"]/div"));

    public static final Target BTN_CONTINUE_SHOPPING = Target.the("continue comprando")
            .located(By.id("continue-shopping"));

    public static final Target BTN_CHECKOUT = Target.the("boton checkout")
            .located(By.id("checkout"));
}
