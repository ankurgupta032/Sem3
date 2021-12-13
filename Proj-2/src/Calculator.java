/*
Create a new class called Calculator with the following methods:
        1. A static method called powerInt(int num1,int num2)
        This method should return num1 to the power num2.
        2. A static method called powerDouble(double num1,int num2).
        This method should return num1 to the power num2.
        3. Invoke both the methods and test the functionalities.
        Hint: Use Math.pow(double,double) to calculate the power.
*/
class Calculator {
    static double powerInt(int x,int y){     //pow returns double...............................
         return Math.pow(x,y);
    }
    static Double powerDouble(double num1,double num2){
        return Math.pow(num1,num2);
    }
    public static void main(String[] args) {
        double a=powerInt(2,2);
        double b=powerDouble(2.0,2.0);
        System.out.println(a);
        System.out.println(b);
    }
}



