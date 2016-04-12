package com.battlecity.Model;


import java.util.ArrayList;
import com.battlecity.View.*;

/**
 * Created by Dawid on 2016-04-12.
 */
public class Plansza {
    private ArrayList listaObiektow;
    private ArrayList listaPociskow;
    private Interfejs interfejs;
    private static final int ROZMIAR_PLANSZY = 32;

    public Plansza(){
        this.interfejs = new Interfejs();

    }

    public void Kolizja(){
        //taka sobie kolizja
    }

    public void Graj(){
        // tu toczy sie logika gry
    }
    public void Rysuj(){
        imterejs.RysujGre(listaObiektow, ROZMIAR_PLANSZY);
        // tu rysujesz
    }

}
