package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Készítsünk programot, amely bekér két számot, majd a kettő közötti
        //számtartományban kiír három darab véletlen számot.
        Scanner konzol = new Scanner(System.in);
        System.out.println("Adj meg egy számot");
        int kezdet = konzol.nextInt();
        System.out.println("Adj meg még egy számot");
        int kezdet2 = konzol.nextInt();
        Random gen = new Random();
        for( int i = 0; i !=3; i++ )
        {
            int véletlenszám = gen.nextInt(kezdet2) + kezdet;
            System.out.println(véletlenszám);

        }

    }
}
