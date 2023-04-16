package model;

public class Cat {

    private String race;
    private String name;

    public Cat(String name, String race){
        this.name = name;
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
