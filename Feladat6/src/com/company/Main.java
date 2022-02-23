package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Írj programot, mely beolvas három egész számot, és kiírja a képernyőre a legkisebbet
        Scanner konzol = new Scanner(System.in);
        System.out.println("Adj meg egy számot");
        Float szám4 = konzol.nextFloat();
        System.out.println("Adj meg még egy számot");
        Float szám5 = konzol.nextFloat();
        System.out.println("Adj meg még egy számot");
        Float szám6 = konzol.nextFloat();
        Float kisebb = Math.min(szám5,szám6);
        System.out.println(Math.min(szám4,kisebb));
    }
}
