/*
Read a value of floating point with two decimal places. This represents a monetary value. After this, calculate the smallest possible number of notes and coins on which the value can be decomposed. The considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01. Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.

Input
The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).

Output
Print the minimum quantity of banknotes and coins necessary to change the initial value, as the given example.
 */
package beecrowd.basic.bee1021BanknotesAndCoins;

import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        System.out.println("NOTAS");
        System.out.println(value / 100 + " nota(s) de R$ 100,00");
        value = value % 100;
        System.out.println(value / 50 + " nota(s) de R$ 50,00");
        value = value % 50;
        System.out.println(value / 20 + " nota(s) de R$ 20,00");
        value = value % 20;
        System.out.println(value / 10 + " nota(s) de R$ 10,00");
        value = value % 10;
        System.out.println(value / 5 + " nota(s) de R$ 5,00");
        value = value % 5;
        System.out.println(value / 2 + " nota(s) de R$ 2,00");
        value = value % 2;

        System.out.println("MOEDAS");
        System.out.println(value / 1 + " moeda (s) de R$ 1,00");
        value = value % 1;
        System.out.println(value / 0.50 + " moeda (s) de R$ 0,50");
        value = value % 0.50;
        System.out.println(value / 0.25 + " moeda (s) de R$ 0,25");
        value = value % 0.25;
        System.out.println(value / 0.10 + " moeda (s) de R$ 0,10");
        value = value % 0.10;
        System.out.println(value / 0.05 + " moeda (s) de R$ 0,05");
        value = value % 0.05;
        System.out.println(value / 0.01 + " moeda (s) de R$ 0,01");


    }
}
