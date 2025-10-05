package co.com.proyectobase.screenplay.ui.confirmarcompra;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmarCompraPage {

    public static final Target SECTION_CONFIRMAR_COMPRA = Target.the("section confirmar compra")
            .located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

    public static final Target LOGO = Target.the("logo")
            .located(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));

    public static final Target LABEL_PRODUCT_BACKPACK = Target.the("label producto backpack")
            .located(By.xpath("//*[@id=\"item_4_title_link\"]/div"));

    public static final Target LABEL_PRODUCT_BIKE = Target.the("label producto bike")
            .located(By.xpath("//*[@id=\"item_0_title_link\"]/div"));

    public static final Target BTN_CANCEL = Target.the("boton cancelar")
            .located(By.id("cancel"));

    public static final Target BTN_FINISH = Target.the("boton finalizar")
            .located(By.id("finish"));
}
