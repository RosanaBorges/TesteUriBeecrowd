/*In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 e 1. Print the read value and the list of banknotes.

Input
The input file contains an integer value N (0 < N < 1000000).

Output
Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, as the given example. Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.

 */
package beecrowd.basic.bee1018Banknotes;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(value);
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
        System.out.println(value / 1 + " nota(s) de R$ 1,00");


    }
}
