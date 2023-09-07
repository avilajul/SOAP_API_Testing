package co.com.company.certification.soap.stepdefinitions;

import co.com.company.certification.soap.models.NumbersData;
import co.com.company.certification.soap.questions.ResponseResultMultiplication;
import co.com.company.certification.soap.tasks.DoMultiplication;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;

import static co.com.company.certification.soap.utils.constants.Constants.REQREST_URL_BASE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MultiplicationStepDefinitions {
    @Given("^julian entered the calculator page$")
    public void julianEnteredTheCalculatorPage() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(REQREST_URL_BASE));
    }

    @When("^julian sends two positive integers$")
    public void julianSendsTwoPositiveIntegers(List<NumbersData> numbers) {
        theActorInTheSpotlight().attemptsTo(DoMultiplication.withTheNumbers(numbers.get(0)));
    }

    @Then("^julian gets the expected result$")
    public void julianGetsTheExpectedResult(List<NumbersData> resultData) {
        theActorInTheSpotlight().should(
                seeThat(ResponseResultMultiplication.isTheExpected(resultData.get(0))
                )
        );
    }
}
