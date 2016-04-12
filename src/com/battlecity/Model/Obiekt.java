package com.battlecity.Model;

/**
 * Created by Kornel on 2016-04-12.
 */
public abstract class Obiekt {
    protected int wytrzymalosc;
    protected int X;
    protected int Y;
    protected char kto;

    public Obiekt(){
        this.wytrzymalosc = 0;
        this.X = 0;
        this.Y = 0;
        this.kto = '#';
    }
    public void Init(int wytrzymalosc_int, char kto_char, int x, int y){
        this.X = x;
        this.Y = y;
        this.kto = kto_char;
        this.wytrzymalosc = wytrzymalosc_int;
    }
    //public abstract void akcja();
}
