/*
Calculate a car's average consumption being provided the total distance traveled (in Km) and the spent fuel total (in liters).

Input
The input file contains two values: one integer value X representing the total distance (in Km) and the second one is a floating point number Y  representing the spent fuel total, with a digit after the decimal point.

Output
Present a value that represents the average consumption of a car with 3 digits after the decimal point, followed by the message "km/l".
 */

package beecrowd.basic.bee1014Consumption;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        double averageConsumption = (x / y);
        System.out.println(String.format("%.3f Km/l ", averageConsumption));
    }
}
