/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 02-05-2021
 *Time: 11:02 PM
 */

package Basics;
import java.util.Scanner;

public class EvenOddWithoutDeclaring {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a Number");
        Scanner input = new Scanner(System.in);
        x= input.nextInt();
        if (x%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is odd");
        }

    }




}
