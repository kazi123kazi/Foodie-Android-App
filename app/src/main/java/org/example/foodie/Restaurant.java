package org.example.foodie;

public class Restaurant {
    String name,imageUrl,description;
    int eta;
    float rating;


    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Restaurant(String name, String imageUrl, float rating, int eta, String description) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.eta=eta;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public float getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
