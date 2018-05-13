package com.udacity.tourguide.models;

/**
 * Created by jesse on 22/04/18.
 * This is a part of the project nanodegree-android-basic-tour-guide-app.
 */
public class Startup {
    private String name;
    private String description;
    private int mImageResourceId;
    private double lat;
    private double lng;
    private int founded;
    private String founders;
    private String industry;
    private String site;
    private String address;



    public Startup(String name, String description, int mImageResourceId, Double lat, Double lng, int founded, String founders, String site, String industry, String address) {
        this.name = name;
        this.description = description;
        this.mImageResourceId = mImageResourceId;
        this.lat = lat;
        this.lng = lng;
        this.founded = founded;
        this.founders = founders;
        this.site = site;
        this.industry = industry;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
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
        this.lat = lng;
    }

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public String getFounders() {
        return founders;
    }

    public void setFounders(String founders) {
        this.founders = founders;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
