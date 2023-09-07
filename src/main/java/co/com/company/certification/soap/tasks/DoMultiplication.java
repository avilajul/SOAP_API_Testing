package co.com.company.certification.soap.tasks;

import co.com.company.certification.soap.models.NumbersData;
import co.com.company.certification.soap.utils.various.RequestBody;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.company.certification.soap.utils.constants.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMultiplication implements Task {
    NumbersData numbersData;

    public DoMultiplication(NumbersData numbersData) {
        this.numbersData = numbersData;
    }

    public static DoMultiplication withTheNumbers(NumbersData numbersData) {
        return instrumented(DoMultiplication.class, numbersData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String requestBody = RequestBody.multipliesTwoIntegers(numbersData);
        actor.attemptsTo(
                Post.to(RESOURCE).with(
                        request -> request
                                .header(CONTENT_TYPE, TEXT_XML_CHARSET_UTF_8)
                                .header(SOAPACTION, SOAP_URL)
                                .body(requestBody)
                )
        );
    }
}
