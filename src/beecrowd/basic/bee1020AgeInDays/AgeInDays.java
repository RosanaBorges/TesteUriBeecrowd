/*
Read an integer value corresponding to a person's age (in days) and print it in years, months and days, followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.

Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days every month. In the cases of test there will never be a situation that allows 12 months and some days, like 360, 363 or 364. This is just an exercise for the purpose of testing simple mathematical reasoning.

Input
The input file contains 1 integer value.

Output
Print the output, like the following example.
 */
package beecrowd.basic.bee1020AgeInDays;

import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valueInput = sc.nextInt();

        int years = valueInput / 365;
        valueInput -= years * 365;
        int months = valueInput/30;
        valueInput -= months*30;
        int days = valueInput;

        System.out.println( years + " ano(s)");
        System.out.println( months + " mes(es)");
        System.out.println( days + " dia(s)");

    }
}
