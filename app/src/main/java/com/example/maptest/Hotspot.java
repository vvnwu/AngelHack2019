package com.example.maptest;

public class Hotspot {

    private double locLongitude;
    private double locLatitude;
    private String locName;
    private boolean isActive;

    public Hotspot(double myLong, double myLat, String myName, boolean myActive){
        locLongitude = myLong;
        locLatitude = myLat;
        locName = myName;
        isActive = myActive;
    }
}
