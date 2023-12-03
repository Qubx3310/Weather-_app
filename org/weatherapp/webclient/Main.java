package org.weatherapp.webclient;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Dodawanie lokalizacji");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("5. Zakończ aplikację.");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    WeatherApiClient weatherApiClient = new WeatherApiClient();
                    FileStorage storage = new FileStorage();


                    System.out.println("Podaj miasto");
                    String city = scanner.next();
                    System.out.println("Podaj kraj");
                    String country = scanner.next();
                    System.out.println("Podaj szerokość geograficzną");
                    boolean incorrect=false;
                    double lat;
                    do {
                        lat = scanner.nextDouble();
                        if (lat >= -90.0 && lat <= 90.0) {
                            incorrect =false;

                        }else {
                            System.out.println("Nie poprawna szerokość geograficzna");
                            incorrect =true;

                        }
                    } while(incorrect);

                    System.out.println("Podaj długość geograficzną");
                    double lon;
                    do {
                        lon = scanner.nextDouble();
                        if (lon >= -180.0 && lon <= 180) {
                            incorrect =false;

                        }else {
                            System.out.println("Nie poprawna długość geograficzna");
                            incorrect =true;

                        }
                    } while(incorrect);


                    Location location = new Location(city, country, lat, lon);
                    storage.fileWrite(location);
            }
        } while (choice != 5);
        scanner.close();

    }
}
