package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String name;
    private int frequency;
    private List<Address> locations;

    public Hobby(String name, int frequency, List<Address> locations) {
        this.name = name;
        this.frequency = frequency;
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public List<Address> getLocations() {
        List<Address> temp = new ArrayList<>();
        temp.addAll(locations);
        return temp;
    }
}
