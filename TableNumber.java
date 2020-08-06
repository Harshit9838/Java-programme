/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 06-08-2020
 *Time: 09:56 PM
 */

import java.util.Scanner;

public class TableNumber {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Enter The Number Whose Table You want to Print: ");
        int numberOfUserChoice = scannerObject.nextInt();
        final int HIGHEST_MULTIPLE = 10;
        for (int multiples = 1; multiples <= HIGHEST_MULTIPLE; multiples++) {
            System.out.printf("%d * %d = %d\n", numberOfUserChoice, multiples, numberOfUserChoice * multiples);
        }
    }
}
