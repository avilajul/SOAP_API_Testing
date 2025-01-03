package co.com.company.certification.soap.questions;

import co.com.company.certification.soap.exceptions.ErrorExceptions;
import co.com.company.certification.soap.models.NumbersData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.company.certification.soap.utils.constants.StatusCodes.STATUS_CODE_200;
import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class ResponseResultAddition implements Question<Boolean>{
    NumbersData numbersData;

    public ResponseResultAddition(NumbersData numbersData) {
        this.numbersData = numbersData;
    }

    public static ResponseResultAddition isTheExpected(NumbersData numbersData) {
        return new ResponseResultAddition(numbersData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean expectedResult = false;
        String responseBody;

        if (lastResponse().statusCode() != STATUS_CODE_200){
            throw new ErrorExceptions("ERROR: El servicio respondió con código " + lastResponse().statusCode());
        }else {
            responseBody = lastResponse().xmlPath().getString("Envelope.Body.AddResponse.AddResult");
        }
        if (responseBody.equals(Integer.toString(numbersData.getResult()))){
            expectedResult = true;
        }
        return expectedResult;
    }
}
