package co.com.company.certification.soap.utils.constants;

public class Constants {
    public static final  String ACTOR_NAME = "Julian Avila";
    public static final  String REQREST_URL_BASE = "http://www.dneonline.com/";
    public static final  String RESOURCE = "calculator.asmx";
    public static final  String CONTENT_TYPE = "Content-Type";
    public static final  String TEXT_XML_CHARSET_UTF_8 = "text/xml; charset=utf-8";
    public static final String SOAPACTION = "SOAPAction";
    public static final  String SOAP_URL = "http://tempuri.org/Multiply";
    public static final String NUMBER_INT_A = "$number1";
    public static final String NUMBER_INT_B = "$number2";
    private Constants(){
        throw new IllegalStateException("Utility class");
    }
}
