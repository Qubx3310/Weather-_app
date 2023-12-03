package org.weatherapp.webclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OpenApiClient implements ApiClient {

    private static final String API_URL = "https://api.openweathermap.org/data/3.0/onecall";


    private static final String URL_PARAMS = "?access_key=%s&query=%s";

    private static final String API_KEY = "c72cd7556fb8b71138df89088655eac1";
    // Pamiętej, żeby zmienić API KEY na swój

    @Override
    public HttpResponse<String> getWeather(final String city) throws IOException, InterruptedException {
        final String apiUrl = String.format(API_URL + URL_PARAMS, API_KEY, city); //-> "http://api.weatherstack.com/current?access_key=992a7e1ee0965000ee00774ce1b4f98&query=Gdynia";
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();

        final HttpResponse<String> send = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return send;
    }

}
