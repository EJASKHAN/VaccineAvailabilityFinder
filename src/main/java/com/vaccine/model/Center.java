
package com.vaccine.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "center_id",
    "name",
    "name_l",
    "address",
    "address_l",
    "state_name",
    "state_name_l",
    "district_name",
    "district_name_l",
    "block_name",
    "block_name_l",
    "pincode",
    "lat",
    "long",
    "from",
    "to",
    "fee_type",
    "vaccine_fees",
    "sessions"
})
@Generated("jsonschema2pojo")
public class Center {

    @JsonProperty("center_id")
    private Integer centerId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("name_l")
    private String nameL;
    @JsonProperty("address")
    private String address;
    @JsonProperty("address_l")
    private String addressL;
    @JsonProperty("state_name")
    private String stateName;
    @JsonProperty("state_name_l")
    private String stateNameL;
    @JsonProperty("district_name")
    private String districtName;
    @JsonProperty("district_name_l")
    private String districtNameL;
    @JsonProperty("block_name")
    private String blockName;
    @JsonProperty("block_name_l")
    private String blockNameL;
    @JsonProperty("pincode")
    private String pincode;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("long")
    private Double _long;
    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to;
    @JsonProperty("fee_type")
    private String feeType;
    @JsonProperty("vaccine_fees")
    private List<VaccineFee> vaccineFees = null;
    @JsonProperty("sessions")
    private List<Session> sessions = null;

    @JsonProperty("center_id")
    public Integer getCenterId() {
        return centerId;
    }

    @JsonProperty("center_id")
    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("name_l")
    public String getNameL() {
        return nameL;
    }

    @JsonProperty("name_l")
    public void setNameL(String nameL) {
        this.nameL = nameL;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("address_l")
    public String getAddressL() {
        return addressL;
    }

    @JsonProperty("address_l")
    public void setAddressL(String addressL) {
        this.addressL = addressL;
    }

    @JsonProperty("state_name")
    public String getStateName() {
        return stateName;
    }

    @JsonProperty("state_name")
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @JsonProperty("state_name_l")
    public String getStateNameL() {
        return stateNameL;
    }

    @JsonProperty("state_name_l")
    public void setStateNameL(String stateNameL) {
        this.stateNameL = stateNameL;
    }

    @JsonProperty("district_name")
    public String getDistrictName() {
        return districtName;
    }

    @JsonProperty("district_name")
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @JsonProperty("district_name_l")
    public String getDistrictNameL() {
        return districtNameL;
    }

    @JsonProperty("district_name_l")
    public void setDistrictNameL(String districtNameL) {
        this.districtNameL = districtNameL;
    }

    @JsonProperty("block_name")
    public String getBlockName() {
        return blockName;
    }

    @JsonProperty("block_name")
    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    @JsonProperty("block_name_l")
    public String getBlockNameL() {
        return blockNameL;
    }

    @JsonProperty("block_name_l")
    public void setBlockNameL(String blockNameL) {
        this.blockNameL = blockNameL;
    }

    @JsonProperty("pincode")
    public String getPincode() {
        return pincode;
    }

    @JsonProperty("pincode")
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("long")
    public Double getLong() {
        return _long;
    }

    @JsonProperty("long")
    public void setLong(Double _long) {
        this._long = _long;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @JsonProperty("fee_type")
    public String getFeeType() {
        return feeType;
    }

    @JsonProperty("fee_type")
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    @JsonProperty("vaccine_fees")
    public List<VaccineFee> getVaccineFees() {
        return vaccineFees;
    }

    @JsonProperty("vaccine_fees")
    public void setVaccineFees(List<VaccineFee> vaccineFees) {
        this.vaccineFees = vaccineFees;
    }

    @JsonProperty("sessions")
    public List<Session> getSessions() {
        return sessions;
    }

    @JsonProperty("sessions")
    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Center.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("centerId");
        sb.append('=');
        sb.append(((this.centerId == null)?"<null>":this.centerId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameL");
        sb.append('=');
        sb.append(((this.nameL == null)?"<null>":this.nameL));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("addressL");
        sb.append('=');
        sb.append(((this.addressL == null)?"<null>":this.addressL));
        sb.append(',');
        sb.append("stateName");
        sb.append('=');
        sb.append(((this.stateName == null)?"<null>":this.stateName));
        sb.append(',');
        sb.append("stateNameL");
        sb.append('=');
        sb.append(((this.stateNameL == null)?"<null>":this.stateNameL));
        sb.append(',');
        sb.append("districtName");
        sb.append('=');
        sb.append(((this.districtName == null)?"<null>":this.districtName));
        sb.append(',');
        sb.append("districtNameL");
        sb.append('=');
        sb.append(((this.districtNameL == null)?"<null>":this.districtNameL));
        sb.append(',');
        sb.append("blockName");
        sb.append('=');
        sb.append(((this.blockName == null)?"<null>":this.blockName));
        sb.append(',');
        sb.append("blockNameL");
        sb.append('=');
        sb.append(((this.blockNameL == null)?"<null>":this.blockNameL));
        sb.append(',');
        sb.append("pincode");
        sb.append('=');
        sb.append(((this.pincode == null)?"<null>":this.pincode));
        sb.append(',');
        sb.append("lat");
        sb.append('=');
        sb.append(((this.lat == null)?"<null>":this.lat));
        sb.append(',');
        sb.append("_long");
        sb.append('=');
        sb.append(((this._long == null)?"<null>":this._long));
        sb.append(',');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("to");
        sb.append('=');
        sb.append(((this.to == null)?"<null>":this.to));
        sb.append(',');
        sb.append("feeType");
        sb.append('=');
        sb.append(((this.feeType == null)?"<null>":this.feeType));
        sb.append(',');
        sb.append("vaccineFees");
        sb.append('=');
        sb.append(((this.vaccineFees == null)?"<null>":this.vaccineFees));
        sb.append(',');
        sb.append("sessions");
        sb.append('=');
        sb.append(((this.sessions == null)?"<null>":this.sessions));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
