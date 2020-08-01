/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 01-08-2020
 *Time: 03:08 PM
 */

import java.util.Scanner;

public class lab4task {
    private static final byte TOTAL_PARTICIPANTS = 100;

    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " +
                "See you at the conference!";
        System.out.println(message);
    }
        public static void main(String[] args) {
            byte st = 0;
            while (st <= 100) {
                System.out.println("Total Tickets Left: " + (100 - st));
                System.out.println("Enter your Name: ");
                Scanner A = new Scanner(System.in);
                String s = A.next();
                sellTicket(s);
                st += 1;
                if (st == 100) {
                    System.out.println("Sorry, The tickets are sold-out!");
                    break;
                }

            }
        }
    }

