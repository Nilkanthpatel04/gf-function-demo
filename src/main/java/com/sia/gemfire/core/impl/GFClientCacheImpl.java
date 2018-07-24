package com.sia.gemfire.core.impl;

import com.sia.gemfire.core.GFClientCache;
import com.sia.gemfire.function.object.MealSSRResponse;
import com.sia.gemfire.function.object.PassengerItinerary;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class GFClientCacheImpl implements GFClientCache {
    @Override
    public List<PassengerItinerary> processRequest(String passengerId, boolean isKF) {
        return _processRequest(passengerId, isKF, null, null, null, null);
    }

    @Override
    public List<PassengerItinerary> processRequest(String passengerId,  boolean isKF, Timestamp departureDate) {
        return _processRequest(passengerId, isKF, departureDate, null, null, null);
    }

    @Override
    public List<PassengerItinerary> processRequest(String passengerId, boolean isKF, Timestamp departureDate, String cabinClass) {
        return _processRequest(passengerId, isKF, departureDate, cabinClass, null, null);
    }

    @Override
    public List<PassengerItinerary> processRequest(String passengerId, boolean isKF, Timestamp departureDate, String cabinClass, String carrierCode) {
        return _processRequest(passengerId, isKF, departureDate, cabinClass, carrierCode, null);
    }

    @Override
    public List<PassengerItinerary> processRequest(String passengerId, boolean isKF, Timestamp departureDate, String cabinClass, String carrierCode, String channel) {
        return _processRequest(passengerId, isKF, departureDate, cabinClass, carrierCode, channel);
    }

    private List<PassengerItinerary> _processRequest(String passengerId, boolean isKF, Timestamp departureDate, String cabinClass, String carrierCode, String channel){
        //TODO: add processing.

        return new ArrayList<PassengerItinerary>();
    }
}
