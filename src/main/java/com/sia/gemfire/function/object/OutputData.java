package com.sia.gemfire.function.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OutputData implements Serializable {
    private String accNbr;
    private String ruId;
    private String cstNbr;
    private List<PassengerItinerary> passengerItinerary;

    public OutputData() {
        passengerItinerary = new ArrayList<PassengerItinerary>();
    }

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public String getRuId() {
        return ruId;
    }

    public void setRuId(String ruId) {
        this.ruId = ruId;
    }

    public String getCstNbr() {
        return cstNbr;
    }

    public void setCstNbr(String cstNbr) {
        this.cstNbr = cstNbr;
    }

    public List<PassengerItinerary> getPassengerItinerary() {
        return passengerItinerary;
    }

    public void setPassengerItinerary(ArrayList<PassengerItinerary> passengerItinerary) {
        this.passengerItinerary = passengerItinerary;
    }
}
