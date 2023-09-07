package co.com.company.certification.soap.models;

public enum Routes {
    MULTIPLICATION_REQUEST_BODY ("src/test/resources/requests/multiplication.xml");
    private final String routeFile;
    Routes(String routeFile) {
        this.routeFile = routeFile;
    }
    public String getRouteFile(){
        return routeFile;
    }
}
