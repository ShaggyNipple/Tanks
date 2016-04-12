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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kamien kamien = (Kamien) o;

        return kamienistosc == kamien.kamienistosc;

    }

    @Override
    public int hashCode() {
        return kamienistosc;
    }
}
