/*Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior". Use the following formula:



Input
The input file contains 3 integer values.

Output
Print the greatest of these three values followed by a space and the message “eh o maior”.

 */

package beecrowd.basic.bee1013TheGreatest;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c){
            System.out.println( a + " eh o maior");
        } else if (b >= a && b >= c){
            System.out.println(b + " eh o maior");
        }else {
            System.out.println( c + " eh o maior");
        }




    }
}
