package com.desafiolatam.perrosapp.model;

import java.security.Timestamp;
import java.util.List;

public class Favorite {
    //pojo que se conectara con el firestore
    private String raza;
    private List<String> favorites;
    private Timestamp timestamp;

    public Favorite(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Favorite(String raza, List<String> favorites) {
        this.raza = raza;
        this.favorites = favorites;


    }
}
