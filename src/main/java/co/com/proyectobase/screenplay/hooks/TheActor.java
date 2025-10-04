package co.com.proyectobase.screenplay.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;


public class TheActor {

    public static Actor actor;
    @Managed
    public WebDriver hisBrowser;

    @Before
    public void setTheActor(){

        actor = Actor.named("tester");
        actor.can(BrowseTheWeb.with(hisBrowser));
    }

}
