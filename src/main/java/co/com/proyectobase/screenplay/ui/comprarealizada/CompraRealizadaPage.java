package co.com.proyectobase.screenplay.ui.comprarealizada;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraRealizadaPage {

    public static final Target SECTION_COMPRA_REALIZADA = Target.the("section confirmar compra")
            .located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

    public static final Target LOGO = Target.the("logo")
            .located(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));

    public static final Target TITLE_LABEL_THANK_ORDER = Target.the("titulo gracias por tu compra")
            .located(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));

    public static final Target SUBTITLE_LABEL_THANK_ORDER = Target.the("subtitulo gracias por tu compra")
            .located(By.xpath("//*[@id=\"checkout_complete_container\"]/div"));

    public static final Target BTN_BACK_HOME = Target.the("boton ir al home")
            .located(By.id("back-to-products"));
}
