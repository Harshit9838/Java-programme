/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 27-07-2020
 *Time: 08:45 PM
 */

package course.lab.labTasks;

import java.util.Scanner;

public class Lab3Task {
    public static final String DISCOUNT_CODE = "CoVid19";
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);
        String clientInputDiscountCode = scannerObject.nextLine();
        scannerObject.close();
        if (clientInputDiscountCode.isEmpty() ||clientInputDiscountCode.isBlank()) {
            System.out.println("Coupon code not accepted");
        } else if (clientInputDiscountCode.toLowerCase().equals(DISCOUNT_CODE.toLowerCase())) {
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
        }

    }


}
