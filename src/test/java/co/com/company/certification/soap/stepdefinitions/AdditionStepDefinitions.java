package co.com.company.certification.soap.stepdefinitions;

import co.com.company.certification.soap.models.NumbersData;
import co.com.company.certification.soap.questions.ResponseResultAddition;
import co.com.company.certification.soap.questions.ResponseResultMultiplication;
import co.com.company.certification.soap.tasks.DoMultiplication;
import co.com.company.certification.soap.tasks.DoingSum;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AdditionStepDefinitions {

    @When("julian adds two positive integers")
    public void julianAddsTwoPositiveIntegers(DataTable numbers) {
        theActorInTheSpotlight().attemptsTo(DoingSum.withTheNumbers(NumbersData.setData(numbers).get(0)));
    }

    @Then("julian gets the result of the sum")
    public void julianGetsTheResultOfTheSum(DataTable resultData) {
        theActorInTheSpotlight().should(
                seeThat(ResponseResultAddition.isTheExpected(NumbersData.setData(resultData).get(0))
                )
        );
    }
}
