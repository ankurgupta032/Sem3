package Basics;

import java.util.Scanner;
                                        //1-
//taking user input normal
//public class test {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int x=sc.nextInt();
//        double y=sc.nextDouble();
//        String s=sc.nextLine();
        //and this is important case in this java

//        int a=sc.nextInt();
//        String b=sc.nextLine();
//        b=sc.nextLine();
//    }
//}
                                    //2-greater no. using ternary operator....
//public class test {
//    public static void main(String[] args) {
//        int a=1,b=2,c=3,result=0;
//        result=a>b?a>c?a:c:b>c?b:c;
//        System.out.println(result);
//    }
//}
                                //3-swap two no.
//public class test{
//    public static void main(String[] args) {
//        int m=1,n=3;
//        m=m^n;
//        n=m^n;
//        m=m^n;
//        System.out.println(m+""+n);
//    }
//}
                                //4-check no. is even or odd
//public class test{
//    public static void main(String[] args) {
//        int a=5;
//        if((a|1)>a){
//            System.out.println("Even");
//        }
//        else
//            System.out.println("Odd");
//    }
//}


                            //5-hcf and lcm and gcd
public class test{
    public static void main(String[] args) {
            int a=8,b=20,gcd=0,lcm;
            for(int i=1;i<=a &i<=b;i++){
                if((a%i)==0 && (b%i)==0)
                    gcd=i;
            }
        System.out.println(gcd);
            lcm=(a*b)/gcd;
        System.out.println(lcm);
            }
       }

