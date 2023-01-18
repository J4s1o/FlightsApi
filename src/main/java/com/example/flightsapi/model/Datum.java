
package com.example.flightsapi.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "aircraft",
    "airline",
    "arrival",
    "departure",
    "flight",
    "geography",
    "speed",
    "status",
    "system"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("aircraft")
    private Aircraft aircraft;
    @JsonProperty("airline")
    private Airline airline;
    @JsonProperty("arrival")
    private Arrival arrival;
    @JsonProperty("departure")
    private Departure departure;
    @JsonProperty("flight")
    private Flight flight;
    @JsonProperty("geography")
    private Geography geography;
    @JsonProperty("speed")
    private Speed speed;
    @JsonProperty("status")
    private String status;
    @JsonProperty("system")
    private System system;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("aircraft")
    public Aircraft getAircraft() {
        return aircraft;
    }

    @JsonProperty("aircraft")
    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @JsonProperty("airline")
    public Airline getAirline() {
        return airline;
    }

    @JsonProperty("airline")
    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    @JsonProperty("arrival")
    public Arrival getArrival() {
        return arrival;
    }

    @JsonProperty("arrival")
    public void setArrival(Arrival arrival) {
        this.arrival = arrival;
    }

    @JsonProperty("departure")
    public Departure getDeparture() {
        return departure;
    }

    @JsonProperty("departure")
    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    @JsonProperty("flight")
    public Flight getFlight() {
        return flight;
    }

    @JsonProperty("flight")
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @JsonProperty("geography")
    public Geography getGeography() {
        return geography;
    }

    @JsonProperty("geography")
    public void setGeography(Geography geography) {
        this.geography = geography;
    }

    @JsonProperty("speed")
    public Speed getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("system")
    public System getSystem() {
        return system;
    }

    @JsonProperty("system")
    public void setSystem(System system) {
        this.system = system;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
