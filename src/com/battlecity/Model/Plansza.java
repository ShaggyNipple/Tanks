package com.battlecity.Model;


import java.util.ArrayList;
import com.battlecity.View.*;
import java.util.List;

/**
 * Created by Dawid on 2016-04-12.
 */
public class Plansza {
    private List<Obiekt> listaObiektow;
    private ArrayList listaPociskow;
    private Interfejs interfejs;
    private static final int ROZMIAR_PLANSZY = 32;

    public Plansza(){
        this.interfejs = new Interfejs();
        this.listaObiektow = new ArrayList<Obiekt>();
    }

    public void Kolizja(){
        //taka sobie kolizja
    }

    public void Graj(){
        // tu toczy sie logika gry
    }
    public void Rysuj(){
        interfejs.RysujGre(listaObiektow, ROZMIAR_PLANSZY);
        // tu rysujesz
    }

}
