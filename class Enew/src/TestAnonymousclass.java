/*Annonymous nested class................................
//Annonymous object of abstract class ..........................
1-abstract modifier...-if you donot know the behaviour declare method with abstract modifier.
                        if a class is having abstract method then it is mandatory to create the class eith abstract modifier.
                        widening concept does not create an error but narrowing create error.
2-interface....
*/
//1---
 abstract class Result{
 abstract public void calculateResult();
}

//class second extends Result{
//
//      public void calculateResult() {
//          System.out.println("welcome Ankur gupta");
//     }
//}

//Annonymous object....
public class TestAnonymousclass {
    public static void main(String[] args) {
        Result obj1=new Result() {  //from new Result it is annonymous child class, can only be used once throughout the program.
            @Override
            public void calculateResult() {
                System.out.println("Hello");
            }
        };
        Result obj2=new Result() {
            @Override
            public void calculateResult() {
                System.out.println("Second object");
            }
        };
        Result obj3=new Result(){

            @Override
            public void calculateResult() {
                System.out.println("Ankur");
            }
        };
//        second obj=new second();
//        obj.calculateResult();
        obj1.calculateResult();
    }
}
