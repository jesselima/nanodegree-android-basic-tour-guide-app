package com.udacity.tourguide.models;


public class Place {

    private String name;
    private String marker;
    private Double lat;
    private Double lng;



    public Place() {
    }

    public Place(String name, String marker, Double lat, Double lng) {
        this.name = name;
        this.marker = marker;
        this.lat = lat;
        this.lng = lng;
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

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", marker='" + marker + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
