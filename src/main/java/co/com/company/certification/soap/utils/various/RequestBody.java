package co.com.company.certification.soap.utils.various;

import co.com.company.certification.soap.exceptions.FileHandlingExceptions;
import co.com.company.certification.soap.models.NumbersData;
import co.com.company.certification.soap.models.Routes;
import com.google.common.io.Files;
import kotlin.text.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

import static co.com.company.certification.soap.utils.constants.Constants.NUMBER_INT_A;
import static co.com.company.certification.soap.utils.constants.Constants.NUMBER_INT_B;

public class RequestBody {
    private static final Logger LOGGER = LogManager.getLogger();
    private RequestBody() {
    }
        public static String calculator(NumbersData numbersData, String mathematicalOperation){
        String pathXml = Routes.valueOf(chooseOperation(mathematicalOperation)).getRouteFile();
        String xmlBody;
        try{
            xmlBody = Files.asCharSource(new File(pathXml), Charsets.UTF_8).read();
            xmlBody = xmlBody.replace(NUMBER_INT_A, numbersData.getNumber1())
                    .replace(NUMBER_INT_B, numbersData.getNumber2());
        } catch(Exception e){
            LOGGER.error(e);
            throw new FileHandlingExceptions();
        }
        return xmlBody;
    }
    private static String chooseOperation(String mathematicalOperation ){
        String routeName;
        switch (mathematicalOperation) {
            case "Addition":
                routeName = "ADDITION_REQUEST_BODY";
                break;
            case "Multiplication":
                routeName = "MULTIPLICATION_REQUEST_BODY";
                break;
            default:
                routeName = "";
        }
        return routeName;
    }
}
