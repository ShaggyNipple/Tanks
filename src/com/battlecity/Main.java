package com.battlecity;
import com.battlecity.Model.Plansza;

public class Main {

    public static void main(String[] args) {
        System.gc();
        Plansza plansza = new Plansza();


        
        while(true){
            plansza.Graj();
            plansza.Rysuj();
        }

    }
}
