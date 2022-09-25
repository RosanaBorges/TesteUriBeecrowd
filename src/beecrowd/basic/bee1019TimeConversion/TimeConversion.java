/*
Read an integer value, which is the duration in seconds of a certain event in a factory, and inform it expressed in hours:minutes:seconds.

Input
The input file contains an integer N.

Output
Print the read time in the input file (seconds) converted in hours:minutes:seconds like the following example.
 */
package beecrowd.basic.bee1019TimeConversion;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int hours = n / 3600;
        n -= hours * 3600;
        int minutes = n / 60;
        n-= minutes * 60;
        int seconds = n;

        System.out.println(hours +" : "+ minutes+ " : "+ seconds);
    }
}
