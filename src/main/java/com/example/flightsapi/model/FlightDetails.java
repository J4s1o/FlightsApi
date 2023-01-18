package com.example.flightsapi.model;

public class FlightDetails {
    private String arrival;
    private String departure;
    private Double arrivalLon;
    private Double arrivalLat;
    private Double departureLon;
    private Double departureLat;
    private Double actualLon;
    private Double actualLat;
    private String flightNumber;
    private Double speed;
    private Integer direction;

    public FlightDetails(String arrival, String departure, Double arrivalLon, Double arrivalLat, Double departureLon, Double departureLat, Double actualLon, Double actualLat, String flightNumber, Double speed, Integer direction) {
        this.arrival = arrival;
        this.departure = departure;
        this.arrivalLon = arrivalLon;
        this.arrivalLat = arrivalLat;
        this.departureLon = departureLon;
        this.departureLat = departureLat;
        this.actualLon = actualLon;
        this.actualLat = actualLat;
        this.flightNumber = flightNumber;
        this.speed = speed;
        this.direction = direction;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public Double getArrivalLon() {
        return arrivalLon;
    }

    public Double getArrivalLat() {
        return arrivalLat;
    }

    public Double getDepartureLon() {
        return departureLon;
    }

    public Double getDepartureLat() {
        return departureLat;
    }

    public Double getActualLon() {
        return actualLon;
    }

    public Double getActualLat() {
        return actualLat;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Double getSpeed() {
        return speed;
    }

    public Integer getDirection() {
        return direction;
    }
}
