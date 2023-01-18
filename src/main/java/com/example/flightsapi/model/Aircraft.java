
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
    "iataCode",
    "icao24",
    "icaoCode",
    "regNumber"
})
@Generated("jsonschema2pojo")
public class Aircraft {

    @JsonProperty("iataCode")
    private String iataCode;
    @JsonProperty("icao24")
    private String icao24;
    @JsonProperty("icaoCode")
    private String icaoCode;
    @JsonProperty("regNumber")
    private String regNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("iataCode")
    public String getIataCode() {
        return iataCode;
    }

    @JsonProperty("iataCode")
    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    @JsonProperty("icao24")
    public String getIcao24() {
        return icao24;
    }

    @JsonProperty("icao24")
    public void setIcao24(String icao24) {
        this.icao24 = icao24;
    }

    @JsonProperty("icaoCode")
    public String getIcaoCode() {
        return icaoCode;
    }

    @JsonProperty("icaoCode")
    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    @JsonProperty("regNumber")
    public String getRegNumber() {
        return regNumber;
    }

    @JsonProperty("regNumber")
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
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
