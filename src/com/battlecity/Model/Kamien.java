package com.battlecity.Model;

public class Kamien extends Blok {
    private int kamienistosc;

    public Kamien(int kamienistosc) {
        this.kamienistosc = kamienistosc;
    }

    public int getKamienistosc() {
        return kamienistosc;
    }

    public void setKamienistosc(int kamienistosc) {
        this.kamienistosc = kamienistosc;
    }
}
