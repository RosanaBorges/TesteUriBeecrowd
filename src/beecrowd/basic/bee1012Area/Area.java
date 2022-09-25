/*
Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of ​​the square that has side B.
e) the area of the rectangle that has sides A and B.

Input
The input file contains three double values with one digit after the decimal point.

Output
The output file must contain 5 lines of data. Each line corresponds to one of the areas described above, always with a corresponding message (in Portuguese) and one space between the two points and the value. The value calculated must be presented with 3 digits after the decimal point.
 */
package beecrowd.basic.bee1012Area;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi = 3.14159;

        double triangle  = a * c / 2;
        double circle = c * c * pi;
        double trapezium = (a + b) / 2 * c;
        double square = b * b;
        double rectangle = a * b;

        System.out.printf("TRIANGULO: %.3f%n",  triangle );
        System.out.printf("CIRCULO: %.3f%n",  circle );
        System.out.printf("TRAPEZIO: %.3f%n",  trapezium );
        System.out.printf("QUADRADO: %.3f%n",  square );
        System.out.printf("RETANGULO: %.3f%n",  rectangle );

    }
}
