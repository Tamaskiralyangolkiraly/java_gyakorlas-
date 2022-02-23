package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Írjunk programot, mely bekér egy számot, és eldönti, hogy osztható-e 3-mal, 4-gyel vagy 9-cel.
        Scanner konzol = new Scanner(System.in);
        System.out.println("Adj meg egy számot");
        int szám7 = konzol.nextInt();
        if ((szám7 % 3 == 0 ) || (szám7 % 4 ==9) || (szám7 % 9 ==0)) {
            System.out.println("A szám osztható 3-al vagy 4-el vagy 9-el");
        }
        else {
            System.out.println("A szám nem osztható sem 3-al sem 4-el sem 9-el");
        }

    }
}
