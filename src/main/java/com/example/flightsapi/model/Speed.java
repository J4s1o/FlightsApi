
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
    "horizontal",
    "isGround",
    "vspeed"
})
@Generated("jsonschema2pojo")
public class Speed {

    @JsonProperty("horizontal")
    private Double horizontal;
    @JsonProperty("isGround")
    private Integer isGround;
    @JsonProperty("vspeed")
    private Integer vspeed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("horizontal")
    public Double getHorizontal() {
        return horizontal;
    }

    @JsonProperty("horizontal")
    public void setHorizontal(Double horizontal) {
        this.horizontal = horizontal;
    }

    @JsonProperty("isGround")
    public Integer getIsGround() {
        return isGround;
    }

    @JsonProperty("isGround")
    public void setIsGround(Integer isGround) {
        this.isGround = isGround;
    }

    @JsonProperty("vspeed")
    public Integer getVspeed() {
        return vspeed;
    }

    @JsonProperty("vspeed")
    public void setVspeed(Integer vspeed) {
        this.vspeed = vspeed;
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
