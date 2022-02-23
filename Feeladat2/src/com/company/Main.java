package com.company;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Írj programot, beolvassa a felhasználó nevét, majd köszön neki!
        Scanner konzol = new Scanner(System.in);
        System.out.println("Add meg a neved");
        String név = konzol.nextLine();
        System.out.println("helló  "+név);
    }
}
