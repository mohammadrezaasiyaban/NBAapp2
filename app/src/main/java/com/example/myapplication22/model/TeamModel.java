package com.example.myapplication22.model;

public class TeamModel {
    private String image;
    private String names;
    private String InfoTeam;

    public TeamModel(String image, String names, String infoTeam) {
        this.image = image;
        this.names = names;
        InfoTeam = infoTeam;
    }

    public String getInfoTeam() {
        return InfoTeam;


    }

    public void setInfoTeam(String infoTeam) {
        InfoTeam = infoTeam;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
