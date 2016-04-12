package com.battlecity.Model;

/**
 * Created by Kornel on 2016-04-12.
 */
public class Pair<X,Y> {
    private X x;
    private Y y;
    public Pair(X x, Y y){
        this.x = x;
        this.y = y;
    }
    public X getL(){ return x; }
    public Y getR(){ return y; }
    public void setL(X x){ this.x = x; }
    public void setR(Y y){ this.y = y; }
}