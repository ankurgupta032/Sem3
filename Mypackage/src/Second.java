
import p1.First;
import p2.four;
import p2.third;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        First obj=new First();
        System.out.println();
        four obj1=new four();
        int i=obj1.num1;
        System.out.println(i);
        Scanner sc=new Scanner(System.in);
        third obj2=new third();
    }
}
//watch in ppt packages for concept clear2z
/*
public class Second
{
    private int roll;
    private String name;
    public int getRoll()    //accessor method
    {
        return roll;
    }
    public void setRoll(int roll) //mutator method
    {
        this.roll = roll;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println("Roll no.: "+roll);
        System.out.println("Student name: "+name);
    }
}*/


//class Second
//{
//    private int id;
//    private int sal;
//    //getter and setter methods.
//    void setValue(int i,int j)
//    {
//        this.id=i;
//        this.sal=j;
//    }
//    int getId(){
//        return this.id;
//    }
//    int getSal(){
//        return this.sal;
//    }
//}
//
//class Demo2 {
//    public static void main(String[] args) {
//        //display the values of id and sal..
//        Second obj1=new Second();
//        obj1.setValue(3,4);
//        System.out.println(obj1.getId());
//        System.out.println(obj1.getSal());
//    }
//}


