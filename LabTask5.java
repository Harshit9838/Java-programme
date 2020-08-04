/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 04-08-2020
 *Time: 09:10 PM
 */

package labs.lab5;

public class LabTask5 {
    private static final byte RANDOM_NUMBER_MAX_LIMIT = 10;

    private static int generateOTP() {
        final int DIGITS_IN_OTP = 6;
        int oneTimePassword = 0;
        for (int i = 0; i < DIGITS_IN_OTP; i++) {
            int randomNumber = 0;
            randomNumber = createRandomNumber();
            int powersOf10 = (int) Math.pow(10.0, i);
            powersOf10 = randomNumber * powersOf10;
            oneTimePassword = oneTimePassword + powersOf10;
        }
        return oneTimePassword;
    }

    private static int createRandomNumber() {
        return (int) (Math.random() * RANDOM_NUMBER_MAX_LIMIT);
    }

    private static void printOTP(int generatedOTP) {
        String otpString = String.valueOf(generatedOTP);
        for (int i = 0; i < otpString.length(); i++) {
            System.out.print(otpString.charAt(i) + (i < otpString.length() - 1 ? "-" : ""));
        }
    }

    public static void main(String[] args) {
        int generatedOTP = generateOTP();
        System.out.print("Your OTP is : ");
        printOTP(generatedOTP);
    }
}