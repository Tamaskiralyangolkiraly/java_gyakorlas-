package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner sc = new Scanner(System.in);
//        System.out.println("Kérek egy szót");
//        String szó1 = sc.nextLine();
//
//            System.out.println(szó1.length());
//            System.out.println(szó1.charAt(0));
//            System.out.println(szó1.charAt(szó1.length()-1));
//
//
//
//
//        System.out.println("Kérek egy 5 betűs szót");
//        String szó = sc.nextLine();
//        if (szó.length() ==5) {
//            System.out.print(szó.charAt(1));
//            System.out.print(szó.charAt(2));
//            System.out.print(szó.charAt(3));
//        }
//        else {
//            System.out.println("csak ött karakterből álló szót fogadok el");}
//        System.out.println();


        System.out.println("Kérek egy szót");
        String szó2 = sc.nextLine();
        int érték = szó2.length();
        for (int i = 0; i != szó2.length(); i--) {
            while (érték != 0) {
                érték -= 1;
                System.out.print(szó2.charAt(érték));
            }
        }
        System.out.println();


        System.out.println("Kérek egy mondatot");
        String mondat = sc.nextLine();
        for (int i = 0; i < mondat.length(); i++) {
            if (mondat.charAt(i) != ' ') {
                System.out.print(mondat.charAt(i));
            }
        }
        System.out.println(" ");


        System.out.println("Kérek egy szót");
        String szó3 = sc.nextLine();
        for (int i = 0; i != szó3.length(); i++) {
            System.out.print(szó3.charAt(i));
            System.out.print(" ");
        }
        System.out.println(" ");


        System.out.println("Kérek egy mondatot");
        String mondat2 = sc.nextLine();
        for (int i = 0; i != mondat2.length()-1; i++) {
            if (mondat2.charAt(i)== ' '){
                System.out.println();
            }
            else {
                System.out.print(mondat2.charAt(i));
            }

        }
    }
}


