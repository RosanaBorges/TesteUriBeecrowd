/*In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.

Input
The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.

Output
The output file must be a message like the following example where "Valor a pagar" means Value to Pay. Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.

 */
package beecrowd.basic.bee1010SimpleCalculate;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product1 = sc.nextInt();
        int numberProduct1 = sc.nextInt();
        double priceProuct1 = sc.nextDouble();

        int prduct2 = sc.nextInt();
        int numberProduct2 = sc.nextInt();
        double priceProduct2 = sc.nextDouble();

        double valuetoPay;
        valuetoPay = (numberProduct1 * priceProuct1) + (numberProduct2 * priceProduct2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valuetoPay );
    }
}
