package co.com.pattern.facade;

import co.com.pattern.api.AirplaneApi;
import co.com.pattern.api.HotelApi;

public class CheckFacade {

    private AirplaneApi airplaneApi;
    private HotelApi hotelApi;

    public CheckFacade(){
        airplaneApi = new AirplaneApi();
        hotelApi = new HotelApi();
    }

    public void search(String dateGoing, String dateLap, String origin, String destination){
        airplaneApi.flights(dateGoing, dateLap, origin, destination);
        hotelApi.search(dateGoing, dateLap);
    }
}
