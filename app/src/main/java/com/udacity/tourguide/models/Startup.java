package com.udacity.tourguide.models;

/**
 * Created by jesse on 22/04/18.
 * This is a part of the project nanodegree-android-basic-tour-guide-app.
 */
public class Startup {
    private String name;
    private String description;
    private int mImageResourceId;
//    private String categories;
//    private int founded_year;
//    private String founders;
//    private String operation_status;
//    private String site;
//    private String email;


    public Startup(String name, String description, int mImageResourceId/*,  String categories, int founded_year, String founders, String operation_status, String site, String email*/) {
        this.name = name;
        this.description = description;
        this.mImageResourceId = mImageResourceId;
//        this.categories = categories;
//        this.founded_year = founded_year;
//        this.founders = founders;
//        this.operation_status = operation_status;
//        this.site = site;
//        this.email = email;
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

//    public String getCategories() {
//        return categories;
//    }
//
//    public void setCategories(String categories) {
//        this.categories = categories;
//    }
//
//    public int getFounded_year() {
//        return founded_year;
//    }
//
//    public void setFounded_year(int founded_year) {
//        this.founded_year = founded_year;
//    }
//
//    public String getFounders() {
//        return founders;
//    }
//
//    public void setFounders(String founders) {
//        this.founders = founders;
//    }
//
//    public String getOperation_status() {
//        return operation_status;
//    }
//
//    public void setOperation_status(String operation_status) {
//        this.operation_status = operation_status;
//    }
//
//    public String getSite() {
//        return site;
//    }
//
//    public void setSite(String site) {
//        this.site = site;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
}
