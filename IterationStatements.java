/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 02-08-2020
 *Time: 08:28 PM
 */

package course.lecture.loop;

public class IterationStatements {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(i % 2 ==0) {
                continue;

            }
            System.out.print(i + ", ");
        }
    }

}
