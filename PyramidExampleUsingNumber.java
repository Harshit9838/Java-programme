/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 03-05-2021
 *Time: 11:21 PM
 */

package Basics;

public class PyramidExampleUsingNumber {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j +" ");
            }
            System.out.println();// new line
        }
    }
}

