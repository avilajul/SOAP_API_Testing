package co.com.company.certification.soap.exceptions;

public class ErrorExceptions extends AssertionError {
    private static final String ERROR = "An error has occurred";
    public ErrorExceptions(String message, Throwable cause){
        super(message, cause);
    }
    public ErrorExceptions(String message){super(message);}
    public ErrorExceptions(){super(ERROR);}
}
