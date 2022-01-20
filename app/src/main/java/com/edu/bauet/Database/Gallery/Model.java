package com.edu.bauet.Database.Gallery;

public class Model {
    private String imageUrl;
    public Model(){

    }
    public Model(String imageUrl){
        this.imageUrl=imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
