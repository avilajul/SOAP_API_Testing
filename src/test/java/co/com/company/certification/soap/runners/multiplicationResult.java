package co.com.company.certification.soap.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/multiplies_two_integers.feature",
        glue = "co.com.company.certification.soap",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class multiplicationResult {
}
