package org.weatherapp.webclient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileStorage {
    final static String PATH = "Locations.txt";

    public void fileWrite(Location location) throws IOException {
        List<Location> locations = getLocations();
        List<Location> collect = locations.stream().filter(location1 -> !location1.getCity().equalsIgnoreCase(location.getCity())).collect(Collectors.toList());
        collect.add(location);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))) {
            String line = String.format("%s,%s,%.2f,%.2f", location.getCity(),
                    location.getCountry(), location.getLat(), location.getLon());
            writer.write(line);
            writer.newLine();
        }
    }

    private List<Location> getLocations() throws IOException {
        List<Location> locationList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Location location = csvLinetoLocation(line);
                locationList.add(location);

            }
        }
        return locationList;
    }

    private Location csvLinetoLocation(String csvLine) {
        String[] fields = csvLine.split(",");
        return new Location(fields[0], fields[1], Double.parseDouble(fields[2]), Double.parseDouble(fields[3]));
    }

}
