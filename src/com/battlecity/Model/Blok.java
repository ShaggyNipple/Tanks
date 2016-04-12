package com.battlecity.Model;

import java.awt.*;

/**
 * Created by Dawid on 2016-04-12.
 */
public class Blok extends Obiekt {
    private Point polozenie;

    private int testowa11;

    public Blok(){
        // a b c d
    }

    public void KolizjaObiektu(Obiekt obt){
        int tmpX,tmpY;
        tmpX = this.getX();
        tmpY = this.getY();

         if( this.getKto() == obt.getKto()){
             // czolg uderzyl w czolg
         }
    }
}
