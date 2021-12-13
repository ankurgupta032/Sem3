//3--
/*import java.util.*;
class sun{
    static int a =0;
    sun(){
        a++;
    }
}
class main {
    public static void main(String[] args) {
        sun s1 = new sun();
        sun s2 = new sun();
        sun s3 = new sun();
        sun s4 = new sun();
        sun s5 = new sun();
        System.out.println(s5.a);
    }
}*/
//4----
/*import java.util.*;
class Student {
    String name;
    int percentage;

    Student() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        percentage = sc.nextInt();

    }

    void display(String n, int p) {
        System.out.println(n);
        System.out.println(p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, j = 0;
        System.out.println("Enter the no. of objects");
        int l = sc.nextInt();
        Student obj[] = new Student[l];
        for (int k = 0; k < obj.length; k++) {
            obj[k] = new Student();
        }
        for (int f = 0; f < obj.length; f++) {
            if (obj[f].percentage > max) {
                max = obj[f].percentage;
                j = f;
            }
        }
        System.out.println(obj[j].percentage);
        System.out.println(obj[j].name);
    }
}*/
//1--
/*import java.util.*;
class car{
    String manufacture;
    int price;
    car(String name, int price){
        this.manufacture = name;
        this.price = price;
    }
}
public class Ass2
{
    public static void main(String[] args) {
        car c1 = new car("BMW",2345);
        car c2 = new car("audi",2745);
        car c3 = new car("lambo",2445);
        int arr[] = new int[3];
        arr[0] = c1.price;
        arr[1] = c2.price;
        arr[2] = c3.price;
        String arr1[] = new String[3];
        arr1[0] = c1.manufacture;
        arr1[1] = c2.manufacture;
        arr1[2] = c3.manufacture;
        Arrays.sort(arr);
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
            System.out.println(arr1[i]);
        }
    }
}
*/

//10---
//import java.util.*;
//class Stu{
//    int b=0;
//    boolean display(int arr1[],int a){
//        for(int j=0;j<arr1.length;j++){
//            if(arr1[j]==a) {
//                b = 1;
//                break;
//            }
//        }
//        if (b==1){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//    boolean i=false;
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        Stu s1=new Stu();
//        int arr[]={10,20,30,40,50};
//        int search= sc.nextInt();
//        boolean b=s1.display(arr,search);
//        System.out.println(b);
//    }
//}


/*
import java.util.Scanner;
public class Ass2 {
    public String name;
    public int rollno, marks;

    Ass2() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        rollno = sc.nextInt();
        marks = sc.nextInt();


    }

    static void Result(String n)
    {
        System.out.println(n);

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int max=0,i=0;
        System.out.println("Enter the number of studemts");
        int l=sc.nextInt();
        Ass2 obj[]=new Ass2[l];
        for(int j=0;j<obj.length;j++)
        {
            obj[j]=new Ass2();
        }
        for(int k=0;k<obj.length;k++)
        {
            if(obj[k].marks>max)
            {
                max=obj[k].marks;
                i=k;
            }
        }
        Result(obj[i].name);

    }
}*/
//8--
//import java.util.*;
//class Calculator{
//    static double powerInt(int x,int y){     //pow returns double...............................
//         return Math.pow(x,y);
//    }
//    static Double powerDouble(double num1,double num2){
//        return Math.pow(num1,num2);
//    }
//    public static void main(String[] args) {
//        double a=powerInt(2,2);
//        double b=powerDouble(2.0,2.0);
//        System.out.println(a);
//        System.out.println(b);
//    }
//}

//7---
//class Programming{
//    String s;
//    Programming(){
//        System.out.println("I love programming");
//    }
//    Programming(String s){
//        this.s=s;
//        System.out.println(s);
//    }
//
//    public static void main(String[] args) {
//        Programming p1=new Programming();
//        Programming p2=new Programming("Ankur");
//    }
//}
//6---
//class Addamount{
//    int amount=50;
//    Addamount(){
//
//    }
//    Addamount(int n){
//        amount+=n;
//    }
//    void display(){
//        System.out.println(amount);
//    }
//
//    public static void main(String[] args) {
//        Addamount obj1=new Addamount();
//        Addamount obj2=new Addamount(5);
//        obj1.display();
//        obj2.display();
//    }
//}

import java.util.Scanner;

//5---
class Student {
    String name;
    int age;
    String address;

    Student(){
        this.name="umknown";
        this.age=0;
        this.address="Not available";
    }
    public void setInfo(String name,int age){
        this.name = name;
        this.age = age;
    }
     public void setInfo(String name,int age,String address) {
         this.name=name;
         this.age = age;
         this.address=address;
    }
}
class Ankur{
    public static void main(String[] args) {
        System.out.println("Enter the required entries");

//        System.out.println(obj1.name+obj1.age+obj1.address);
//        obj1.setInfo("vip",12);
//        System.out.println(obj1.name+obj1.age+obj1.address);

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            Student obj1=new Student();   //object created so is initialized with the default values of the constructor.
            System.out.println("Enter the required no. of inputs");
            int n=sc.nextInt();
            if(n==3) {
                obj1.setInfo(sc.next(), sc.nextInt(), sc.next());
                System.out.print(i+1 + ": name = " + obj1.name + "age = " + obj1.age + "address = " + obj1.address);
            }
            else if(n==0){
                System.out.print(i+1 + ": name = " + obj1.name + "age = " + obj1.age + "address = " + obj1.address);
            }
            else{
                obj1.setInfo(sc.next(), sc.nextInt());
                System.out.print(i+1 + ": name = " + obj1.name + "age = " + obj1.age + "address = " + obj1.address);
            }
        }
//        for(int x=0;x<a.length;x++){
//            System.out.println(a[x].name+" "+a[x].age+" "+a[x].address);
//        }

    }
}

class room{
    boolean ac;
    boolean theatre;
    boolean fan;
    boolean light;

    public room(boolean ac, boolean theatre, boolean fan, boolean light) {
        this.ac = ac;
        this.theatre = theatre;
        this.fan = fan;
        this.light = light;
    }
    public void isOverload(){
        int load = 0;
        if(ac==true){
            load = load + 1200;
        }
        if(theatre == true){
            load = load + 600;
        }
        if(fan == true){
            load = load + 400;
        }
        if(light == true){
            load = load + 100;
        }
        if(load>=2000){
            System.out.println("Overload");
        }
        else{
            System.out.println("Not Overload");
        }
    }
}
class Ankur{
    public static void main(String[] args) {
        room r1=new room(false,true,true,true);
        r1.isOverload();
    }
}















