package org.weatherapp.webclient;

import java.util.UUID;

public abstract class BasicInformation {
    private UUID id;
    private String city;
    private String country;

    public BasicInformation( String city, String country) {
        this.id = createUuid(city,country);
        this.city = city;
        this.country = country;
    }

    public UUID getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
    private UUID createUuid (String city, String country){
        return UUID.nameUUIDFromBytes((city+country).getBytes());
    }

    @Override
    public String toString() {
        return "BasicInformation{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
