package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Frac a = new Frac(7,8);
        Frac a2 = new Frac(1,3);
        Frac s = a.sum(a2);
        //f.num = 5;
       // f.den = 9;
        System.out.println(a2+" "+s);
    }
}
