package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Írj programot, ami beolvas egy számot, majd kiírja a kétszeresét!
        System.out.println("Adj meg egy számot");
        Scanner konzol = new Scanner(System.in);
        Float szám = konzol.nextFloat();
        System.out.println(szám*2);
    }
}
