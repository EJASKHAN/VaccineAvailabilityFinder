
package com.vaccine.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "session_id",
    "date",
    "available_capacity",
    "available_capacity_dose1",
    "available_capacity_dose2",
    "min_age_limit",
    "vaccine",
    "slots"
})
@Generated("jsonschema2pojo")
public class Session {

    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("date")
    private String date;
    @JsonProperty("available_capacity")
    private Integer availableCapacity;
    @JsonProperty("available_capacity_dose1")
    private Integer availableCapacityDose1;
    @JsonProperty("available_capacity_dose2")
    private Integer availableCapacityDose2;
    @JsonProperty("min_age_limit")
    private Integer minAgeLimit;
    @JsonProperty("vaccine")
    private String vaccine;
    @JsonProperty("slots")
    private List<String> slots = null;

    @JsonProperty("session_id")
    public String getSessionId() {
        return sessionId;
    }

    @JsonProperty("session_id")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("available_capacity")
    public Integer getAvailableCapacity() {
        return availableCapacity;
    }

    @JsonProperty("available_capacity")
    public void setAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    @JsonProperty("available_capacity_dose1")
    public Integer getAvailableCapacityDose1() {
        return availableCapacityDose1;
    }

    @JsonProperty("available_capacity_dose1")
    public void setAvailableCapacityDose1(Integer availableCapacityDose1) {
        this.availableCapacityDose1 = availableCapacityDose1;
    }

    @JsonProperty("available_capacity_dose2")
    public Integer getAvailableCapacityDose2() {
        return availableCapacityDose2;
    }

    @JsonProperty("available_capacity_dose2")
    public void setAvailableCapacityDose2(Integer availableCapacityDose2) {
        this.availableCapacityDose2 = availableCapacityDose2;
    }

    @JsonProperty("min_age_limit")
    public Integer getMinAgeLimit() {
        return minAgeLimit;
    }

    @JsonProperty("min_age_limit")
    public void setMinAgeLimit(Integer minAgeLimit) {
        this.minAgeLimit = minAgeLimit;
    }

    @JsonProperty("vaccine")
    public String getVaccine() {
        return vaccine;
    }

    @JsonProperty("vaccine")
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    @JsonProperty("slots")
    public List<String> getSlots() {
        return slots;
    }

    @JsonProperty("slots")
    public void setSlots(List<String> slots) {
        this.slots = slots;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Session.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sessionId");
        sb.append('=');
        sb.append(((this.sessionId == null)?"<null>":this.sessionId));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("availableCapacity");
        sb.append('=');
        sb.append(((this.availableCapacity == null)?"<null>":this.availableCapacity));
        sb.append(',');
        sb.append("availableCapacityDose1");
        sb.append('=');
        sb.append(((this.availableCapacityDose1 == null)?"<null>":this.availableCapacityDose1));
        sb.append(',');
        sb.append("availableCapacityDose2");
        sb.append('=');
        sb.append(((this.availableCapacityDose2 == null)?"<null>":this.availableCapacityDose2));
        sb.append(',');
        sb.append("minAgeLimit");
        sb.append('=');
        sb.append(((this.minAgeLimit == null)?"<null>":this.minAgeLimit));
        sb.append(',');
        sb.append("vaccine");
        sb.append('=');
        sb.append(((this.vaccine == null)?"<null>":this.vaccine));
        sb.append(',');
        sb.append("slots");
        sb.append('=');
        sb.append(((this.slots == null)?"<null>":this.slots));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
