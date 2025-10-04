package co.com.proyectobase.screenplay.runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/",
		glue={"co.com.proyectobase.screenplay.stepdefinitions","co.com.proyectobase.screenplay.hooks"},
		snippets= CucumberOptions.SnippetType.CAMELCASE		)
public class RunnerTags {

}
