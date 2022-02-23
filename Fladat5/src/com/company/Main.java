package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner konzol = new Scanner(System.in);
        //Írj programot, mely beolvas két egész számot, és kiírja a képernyőre a nagyobbikat!
        System.out.println("Adj meg egy számot");
        Float szám2 = konzol.nextFloat();
        System.out.println("Adj meg még egy számot");
        Float szám3 = konzol.nextFloat();
        System.out.println(Math.max(szám2,szám3));
    }
}
