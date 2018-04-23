package com.udacity.tourguide.models;

/**
 * Created by jesse on 22/04/18.
 * This is a part of the project TourGuide.
 */
public class Place {

    private String id;
    private String name;
    private String urlPoi;
    private String marker;
    private String perex;
    private String UrlImage;


    public Place() {
    }

    public Place(String id, String name, String urlPoi, String marker, String perex, String urlImage) {
        this.id = id;
        this.name = name;
        this.urlPoi = urlPoi;
        this.marker = marker;
        this.perex = perex;
        UrlImage = urlImage;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlPoi() {
        return urlPoi;
    }

    public void setUrlPoi(String urlPoi) {
        this.urlPoi = urlPoi;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public String getPerex() {
        return perex;
    }

    public void setPerex(String perex) {
        this.perex = perex;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }


    @Override
    public String toString() {
        return "Place{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", urlPoi='" + urlPoi + '\'' +
                ", marker='" + marker + '\'' +
                ", perex='" + perex + '\'' +
                ", UrlImage='" + UrlImage + '\'' +

                '}';
    }
}
