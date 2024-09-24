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
        public static String multipliesTwoIntegers(NumbersData numbersData){
        String pathXml = Routes.valueOf("MULTIPLICATION_REQUEST_BODY").getRouteFile();
        String xmlBody;
        try{
            xmlBody = Files.asCharSource(new File(pathXml), Charsets.UTF_8).read();
            xmlBody = xmlBody.replace(NUMBER_INT_A, numbersData.getMultiplying())
                    .replace(NUMBER_INT_B, numbersData.getMultiplier());
        } catch(Exception e){
            LOGGER.error(e);
            throw new FileHandlingExceptions();
        }
        return xmlBody;
    }
}
