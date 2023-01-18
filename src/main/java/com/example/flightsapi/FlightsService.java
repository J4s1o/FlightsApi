package com.example.flightsapi;

import com.example.flightsapi.model.Datum;
import com.example.flightsapi.model.FlightData;
import com.example.flightsapi.model.FlightDetails;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Service
public class FlightsService {
    private static String FLIGHT_DATA_URL= "https://app.goflightlabs.com/flights?access_key=";
    private static String AIRPORT_DATA_URL = "https://airlabs.co/api/v9/airports?iata_code=";
    private static String ACCESS_KEY_FLIGHTLABS = "XXX";
    private static String ACCESS_KEY_AIRLABS = "XXX";
    private RestTemplate restTemplate = new RestTemplate();
    FlightDetails getDataFromFlightNumber(String flightNumber){
        HttpEntity httpEntity = new HttpEntity(new HttpHeaders());
        ResponseEntity<FlightData> responseEntity = restTemplate.exchange(FLIGHT_DATA_URL + ACCESS_KEY_FLIGHTLABS + "&flightIcao=" + flightNumber,
                HttpMethod.GET,
                httpEntity,
                FlightData.class);
        Datum result = responseEntity.getBody().getData().get(0);
        FlightDetails FlightDetails = new FlightDetails(result.getArrival().getIataCode(),
                result.getDeparture().getIataCode(),
                getAirportCoordinates(result.getArrival().getIataCode()).get("Lon"),
                getAirportCoordinates(result.getArrival().getIataCode()).get("Lat"),
                getAirportCoordinates(result.getDeparture().getIataCode()).get("Lon"),
                getAirportCoordinates(result.getDeparture().getIataCode()).get("Lat"),
                result.getGeography().getLongitude(),
                result.getGeography().getLatitude(),
                result.getFlight().getIcaoNumber(),
                result.getSpeed().getHorizontal(),
                result.getGeography().getDirection());
        return FlightDetails;
    }
    public Map<String,Double> getAirportCoordinates(String airportCode){
        Map<String, Double> coordinates = new HashMap<>();
        try{
            String URL = AIRPORT_DATA_URL + airportCode + "&api_key=" + ACCESS_KEY_AIRLABS;
            JsonNode data = restTemplate.getForObject(URL, JsonNode.class).get("response").get(0);
            coordinates.put("Lat", data.get("lat").asDouble());
            coordinates.put("Lon",data.get("lng").asDouble());
            return coordinates;
        }
        catch (Exception e){
            coordinates.put("Lat",0.00);
            coordinates.put("Lon",0.00);
            return coordinates;
        }

    }
}
