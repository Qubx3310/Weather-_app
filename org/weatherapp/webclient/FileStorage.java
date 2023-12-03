package org.weatherapp.webclient;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileStorage {
    final static String PATH = "Locations.txt";
    public void fileWrite (Location location) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))){
            String line = String.format("%s,%s,%.2f,%.2f", location.getCity(),
                    location.getCountry(), location.getLat(), location.getLon());
            writer.write(line);
        }
    }
}
