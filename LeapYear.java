/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 02-05-2021
 *Time: 11:17 PM
 */

package Basics;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter A Year");
        Scanner input= new Scanner(System.in);
        year= input.nextInt();

        if(( (year%4==0) && (year%100!=0))|| (year%400==0))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }

    }
}
