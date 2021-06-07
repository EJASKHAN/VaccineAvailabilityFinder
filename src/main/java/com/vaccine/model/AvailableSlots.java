package com.vaccine.model;

/**
 * @author Ejaskhan
 **/
public class AvailableSlots {
    private String centre;
    private String district;
    private String pincode;
    private String feeType;
    private int availableDos1Qty;
    private int availableDos2Qty;
    private int ageLimit;

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public int getAvailableDos1Qty() {
        return availableDos1Qty;
    }

    public void setAvailableDos1Qty(int availableDos1Qty) {
        this.availableDos1Qty = availableDos1Qty;
    }

    public int getAvailableDos2Qty() {
        return availableDos2Qty;
    }

    public void setAvailableDos2Qty(int availableDos2Qty) {
        this.availableDos2Qty = availableDos2Qty;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    @Override
    public String toString() {


        return "Slots are available at \'" + centre + '\'' +
                ", pincode='" + pincode + '\'' +
                ", fee_type='" + feeType + '\'' +
                ", available Dos2_Qty= " + availableDos2Qty +
                ", ageLimit= " + ageLimit;
    }

    public String toStringDos1() {

        return "Slots are available at \'" + centre + '\'' +
                ", pincode='" + pincode + '\'' +
                ", fee_type='" + feeType + '\'' +
                ", available Dos1_Qty= " + availableDos1Qty +
                ", ageLimit= " + ageLimit;
    }
}
