package com.company;

/**
 * Created by student3 on 26.11.16.
 */
public class Frac {
    int num,den;

    public String toString(){
        return num+"/"+den;
    }

    Frac(){
        num = 0;
        den = 1;
    }

    Frac(int num, int den){
        this.num = num;
        this.den = den;
    }

    Frac(int ts){
        this.num = ts;
        this.den = 1;
    }

    int nod(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return nod(b, a % b);
    }

    Frac sum(Frac a){
        return new Frac(((this.num * nod(this.den,a.den)/this.den) + (a.num * nod(this.den,a.den)/a.den) ), nod(this.den,a.den));
    }

    /*Frac mult(int a){
        return new Frac(a.num+1,a.den+10);
    }

    Frac mult(Frac a){
        return new Frac(a.num+1,a.den+10);
    }

    Frac div(int a){
        return new Frac(a.num+1,a.den+10);
    }

    Frac div(Frac a){
        return new Frac(a.num+1,a.den+10);
    }

    Frac inverse(){
        return new Frac(a.num+1,a.den+10);
    }

    boolean isShorten(){
        return new Frac(a.num+1,a.den+10);
    }

    Frac Frac short(){
        return new Frac(a.num+1,a.den+10);
    }

    isEqual(Frac a){
        return new Frac(a.num+1,a.den+10);
    }

    int compareTo(Frac a){
        return new Frac(a.num+1,a.den+10);
    }
    */

}
