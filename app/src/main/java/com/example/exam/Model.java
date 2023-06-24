package com.example.exam;

public class Model {
    int id;
    String title;
    String image;
    String price;
    String tourDescription;
    String firstSight;
    String firstSightDescription;
    String secondSight;
    String secondSightDescription;
    String thirdSight;
    String thirdSightDescription;

    public Model(int id, String title, String image, String price, String tourDescription) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
        this.tourDescription = tourDescription;

    }

    public String getTourDescription() {
        return tourDescription;
    }

    public void setTourDescription(String tourDescription) {
        this.tourDescription = tourDescription;
    }

    public String getFirstSight() {
        return firstSight;
    }

    public void setFirstSight(String firstSight) {
        this.firstSight = firstSight;
    }

    public String getFirstSightDescription() {
        return firstSightDescription;
    }

    public void setFirstSightDescription(String firstSightDescription) {
        this.firstSightDescription = firstSightDescription;
    }

    public String getSecondSight() {
        return secondSight;
    }

    public void setSecondSight(String secondSight) {
        this.secondSight = secondSight;
    }

    public String getSecondSightDescription() {
        return secondSightDescription;
    }

    public void setSecondSightDescription(String secondSightDescription) {
        this.secondSightDescription = secondSightDescription;
    }

    public String getThirdSight() {
        return thirdSight;
    }

    public void setThirdSight(String thirdSight) {
        this.thirdSight = thirdSight;
    }

    public String getThirdSightDescription() {
        return thirdSightDescription;
    }

    public void setThirdSightDescription(String thirdSightDescription) {
        this.thirdSightDescription = thirdSightDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
