/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 02-08-2020
 *Time: 010:14 PM
 */




import java.util.Scanner;

public class BuzzFizz {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int lastNumber = scannerObject.nextInt();
        scannerObject.close();
        for (int number = 1; number <= lastNumber; number++) {
            boolean numberIfDivisibleByThree = (number % 3 == 0);
            boolean numberIfDivisibleByFive = (number % 5 == 0);
            if (numberIfDivisibleByThree && numberIfDivisibleByFive) {
                System.out.print("fizzbuzz" + (number <= lastNumber - 1 ? ", " : " . "));
            } else if (numberIfDivisibleByThree) {
                System.out.print("fizz" + (number <= lastNumber - 1 ? ", " : ". "));
            } else if (numberIfDivisibleByFive) {
                System.out.print("buzz" + (number <= lastNumber - 1 ? ", " : ". "));
            } else {
                System.out.print("buzz" + (number <= lastNumber - 1 ? ", " : ". "));
            }
        }
    }
}
