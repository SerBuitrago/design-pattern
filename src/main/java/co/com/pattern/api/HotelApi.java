package co.com.pattern.api;

public class HotelApi {

    public void search(String dateEntry, String dateOutput){
        System.out.println("\n===============================================================");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Date Entry: ".concat(dateEntry));
        System.out.println("Date Output: ".concat(dateOutput));
        System.out.println("---------------------------------------------------------------");
        System.out.println("Hotels Found:");
        System.out.println("- Hotel Casino Internacional [5 points, $120.000]");
        System.out.println("- Inka Hotel [4 points, $20.000]");
        System.out.println("- Hotel Jayv [2 points, $5.000]");
        System.out.println("- Hotel Fenix [3 points, $15.000]");
        System.out.println("===============================================================");
    }
}
