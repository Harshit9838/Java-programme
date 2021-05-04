/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 04-05-2021
 *Time: 06:11 PM
 */

package Basics;



class AreaOfRectangle
{
    int length;
    int width;
    void insert(int l, int w)
    {
        length=l;
        width=w;
    }
    void calculateArea(){System.out.println(length*width);
    }
}
class TestRectangle1
{
    public static void main(String args[]){
        AreaOfRectangle r1=new AreaOfRectangle();
        AreaOfRectangle r2=new AreaOfRectangle();
        r1.insert(11,5);
        r2.insert(3,15);
        r1.calculateArea();
        r2.calculateArea();
    }
}
