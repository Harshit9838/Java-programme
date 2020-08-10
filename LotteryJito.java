/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 11-08-2020
 *Time: 12:18 AM
 */

import java.util.Scanner;

public class LotteryJito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check your Bhavishya: ");
        int lotteryNumber = scanner.nextInt();
        int[] everyLotteryNumber = {lotteryNumber, 12365, 98756, 34256};
        int luckyLotteryNumber= (int) (Math.random() * everyLotteryNumber.length);
        if (lotteryNumber == luckyLotteryNumber) {
            System.out.println("Congrats! Your Lottery Number is the lucky one.");
        } else {
            System.out.println("Sorry, Better luck next time.");
        }
    }
}