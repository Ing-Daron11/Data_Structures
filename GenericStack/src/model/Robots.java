package model;

import java.security.PrivateKey;

public class Robots {
    private char initial;
    private int size;

    public Robots(char initial, int size){
        this.initial = initial;
        this.size = size;
    }

    public char getInitial() {
        return initial;
    }

    public void setInitial(char initial) {
        this.initial = initial;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
