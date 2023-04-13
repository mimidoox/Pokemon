package com.example.pokemonapp;

import org.json.JSONArray;

import java.util.ArrayList;

public class Pokemon {

    int id;

    String num;
    String name;
    String image;
    ArrayList<String> type;
    String height;
    String weight;


    public Pokemon(int id, String num,String name, String image, ArrayList<String> type, String height, String weight) {
        this.id = id;
        this.num=num;
        this.name = name;
        this.image = image;
        this.type = type;
        this.height = height;
        this.weight = weight;

    }

    public int getId() {
        return id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public ArrayList<String> getType() {
        return type;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }


}