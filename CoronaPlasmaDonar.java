/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 02-05-2021
 *Time: 11:54 PM
 */

package Basics;
import java.util.Scanner;

public class CoronaPlasmaDonar {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please Enter A Name:- ");
        String Name = scannerObject.nextLine();
        System.out.println("Please Enter your Age :- ");
        byte Age = scannerObject.nextByte();
        System.out.println("Enter Number of Vaccine Doses Taken :- ");
        byte vaccineDoses = scannerObject.nextByte();

        if ((Age>18) &&  (vaccineDoses == 2)){
            System.out.println("You can donate Plasma");
        } else {
            if ((Age>18) && (vaccineDoses == 1)) {
                System.out.println("Get the second Dose Vaccinated and after few days you are eligible to donate Plasma");

            } else {
                System.out.println("Sorry, You cannot donate Plasma");
            }
        }
    }
}














