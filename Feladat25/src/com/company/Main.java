package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy egész számot");
        int SZAM1 = sc.nextInt();
        for( int i = 1; i <= SZAM1; i++ )
        {   if (SZAM1 % i ==0) {
            System.out.println(i);
        }
        }
    }
}
