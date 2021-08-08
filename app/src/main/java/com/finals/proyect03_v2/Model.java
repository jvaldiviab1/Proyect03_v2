package com.finals.proyect03_v2;

public class Model {

        String word;
        String id;

    public Model(String id, String word) {
        this.word = word;
        this.id = id;
    }

    public String getTitle() {
        return word;
    }

    public void setTitle(String title) {
        this.word = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
