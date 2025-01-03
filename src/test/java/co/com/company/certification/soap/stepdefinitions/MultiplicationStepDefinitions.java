package co.com.company.certification.soap.stepdefinitions;

import co.com.company.certification.soap.models.NumbersData;
import co.com.company.certification.soap.questions.ResponseResultMultiplication;
import co.com.company.certification.soap.tasks.DoMultiplication;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.company.certification.soap.utils.constants.Constants.REQREST_URL_BASE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MultiplicationStepDefinitions {
    @Given("^julian entered the calculator page$")
    public void julianEnteredTheCalculatorPage() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(REQREST_URL_BASE));
    }

    @When("^julian sends two positive integers$")
    public void julianSendsTwoPositiveIntegers(DataTable numbers) {
        theActorInTheSpotlight().attemptsTo(DoMultiplication.withTheNumbers(NumbersData.setData(numbers).get(0)));
    }

    @Then("^julian gets the expected result$")
    public void julianGetsTheExpectedResult(DataTable resultData) {
        theActorInTheSpotlight().should(
                seeThat(ResponseResultMultiplication.isTheExpected(NumbersData.setData(resultData).get(0))
                )
        );
    }
}
