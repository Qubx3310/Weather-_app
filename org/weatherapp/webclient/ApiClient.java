package org.weatherapp.webclient;

import java.io.IOException;
import java.net.http.HttpResponse;

    public interface ApiClient {

        HttpResponse<String> getWeather(String city) throws IOException, InterruptedException;
        HttpResponse<String> getHistoricalWeather(String city, String date) throws IOException, InterruptedException;

    }
