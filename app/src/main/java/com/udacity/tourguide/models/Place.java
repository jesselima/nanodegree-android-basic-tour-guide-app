package com.udacity.tourguide.models;


public class Place {

    private String name;
    private String marker;

    public Place() {
    }

    public Place(String name, String marker) {
        this.name = name;
        this.marker = marker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", marker='" + marker + '\'' +
                '}';
    }
}
