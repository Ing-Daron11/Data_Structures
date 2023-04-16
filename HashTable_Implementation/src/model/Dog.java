package model;

public class Dog {
    private String name;

    public Dog(String name){
        this.name = name;
    }

    public String getRace() {
        return name;
    }

    public void setRace(String race) {
        this.name = race;
    }
}
