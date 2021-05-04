/*Created by Intellij IDEA
 * Author: Harshit Dixit(Harshit9838)
 * Date: 04-05-2021
 *Time: 05:54 PM
 */

package Basics;

class Employee{
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }
}
    class RecordEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.insert(101,"Harshit",45000);
        e2.insert(102,"Shryansh",25000);
        e3.insert(103,"Utkarsh",55000);
        e1.display();
        e2.display();
        e3.display();
    }
}