package org.weatherapp.webclient;

import java.util.UUID;

public class Location extends BasicInformation {

    private double lat;
    private double lon;

    public Location(String city, String country, double lat, double lon) {
        super(city, country);
        this.lat= lat;
        this.lon=lon;
    }

    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public String getCity() {
        return super.getCity();
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
