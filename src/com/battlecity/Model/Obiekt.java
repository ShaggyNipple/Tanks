package com.battlecity.Model;

/**
 * Created by Kornel on 2016-04-12.
 */
public abstract class Obiekt {
    protected static final char ktoCzolg = 'C';
    protected static final char ktoCegla = 'M';
    protected static final char ktoKamien ='B';
    protected static final char ktoZArosla = 'K';

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

    public void setWytrzymalosc(int wyt){
        this.wytrzymalosc = wyt;
    }
    public int getWytrzymalosc(){
        return this.wytrzymalosc;
    }

    public void setX(int x){
        this.X = x;
    }
    public void setY(int y){
        this.Y = y;
    }

    public int getX(){
        return this.X;
    }

    public int getY(){
        return this.Y;
    }

    //public abstract void akcja();
}
