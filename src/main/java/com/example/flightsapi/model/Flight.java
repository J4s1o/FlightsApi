
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
    "iataNumber",
    "icaoNumber",
    "number"
})
@Generated("jsonschema2pojo")
public class Flight {

    @JsonProperty("iataNumber")
    private String iataNumber;
    @JsonProperty("icaoNumber")
    private String icaoNumber;
    @JsonProperty("number")
    private String number;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("iataNumber")
    public String getIataNumber() {
        return iataNumber;
    }

    @JsonProperty("iataNumber")
    public void setIataNumber(String iataNumber) {
        this.iataNumber = iataNumber;
    }

    @JsonProperty("icaoNumber")
    public String getIcaoNumber() {
        return icaoNumber;
    }

    @JsonProperty("icaoNumber")
    public void setIcaoNumber(String icaoNumber) {
        this.icaoNumber = icaoNumber;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
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
