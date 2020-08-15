/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 15-08-2020
 *Time: 06:23 PM
 */

import java.util.Scanner;
public class AtmPin {
    public static void main(String[] args) {
        final short CORRECT_PIN=4412;
        final byte TOTAL_ATTEMPTS=4;
        Scanner scannerObject =new Scanner(System.in);
        System.out.println("Please enter your pin.");
        short enteredPin=scannerObject.nextShort();
        boolean pinMatches= (enteredPin == CORRECT_PIN);
        if(pinMatches){
            System.out.println("Pin Matches.");
        }
        else{
            for (byte attempts = 1; attempts <= TOTAL_ATTEMPTS; attempts++) {
                System.out.println("Incorrect Pin!, Please re-enter:");
                enteredPin = scannerObject.nextShort();
                pinMatches = (enteredPin == CORRECT_PIN);
                if (pinMatches) {
                    System.out.println("Pin Matches.");
                    break;
                }
                if(attempts==TOTAL_ATTEMPTS){
                    System.out.println("Number of attempts exceeded.");
                }
            }
        }
        scannerObject.close();
    }
}
