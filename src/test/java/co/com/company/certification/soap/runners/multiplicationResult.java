package co.com.company.certification.soap.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/multiplies_two_integers.feature",
        glue = "co.com.company.certification.soap",
        snippets = SnippetType.CAMELCASE
)
public class multiplicationResult {
}
