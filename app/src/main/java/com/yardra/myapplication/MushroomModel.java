package com.yardra.myapplication;

public class MushroomModel {

    //поля сущности
    private String name;
    private String poison;
    private String itoccursoften;
    private int mushRes;

    //конструктор
    public MushroomModel (int mushRes, String name, String poison, String itoccursoften){
        this.mushRes = mushRes;
        this.name = name;
        this.poison = poison;
        this.itoccursoften = itoccursoften;
    }

    //геттеры и сеттеры

    public int getRes() {return mushRes;}
    public void setMushRes(int mushRes) {this.mushRes = mushRes;}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getPoison() {
        return poison;
    }
    public void setPoison(String poison) {
        this.poison = poison;
    }


    public String getItoccursoften() {
        return itoccursoften;
    }
    public void setItoccursoften(String itoccursoften) {
        this.itoccursoften = itoccursoften;
    }


}
