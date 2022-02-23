package co.com.pattern.api;

public class AirplaneApi {

    public void flights(String dateGoing, String dateLap, String origin, String destination){
        System.out.println("\n===============================================================");
        System.out.println("Flights found for ".concat(destination).concat(" from ").concat(origin));
        System.out.println("---------------------------------------------------------------");
        System.out.println("Date Going: ".concat(dateGoing));
        System.out.println("Date Lap: ".concat(dateLap));
        System.out.println("===============================================================");
    }
}
