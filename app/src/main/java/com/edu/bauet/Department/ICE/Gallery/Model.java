package com.edu.bauet.Department.ICE.Gallery;

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
