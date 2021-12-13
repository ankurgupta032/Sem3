package p1;
abstract class Person {
         int age;
         String name;
        public Person(int age,String name){
            this.age=age;
            this.name=name;
        }
}
//Use of super==
//to perform constructor chaining b/w classess we use super parenthesis.
//super method should be the first line of each constructor.
// super can be used inside the constructor.

//Super keyword     vs    Super dot.......................Home sarch
//super cannot be used inside main method............

//interface cannot have constructor. because it has public static final variables.........


//overriding concept is not applicable for static methods but overloading concept is applicable for static method.......
//lambda expression in java 1.8 version

//    We cannot create object of an abstract class  then what is the significance of creating the constructor in the abstract class.
//        Ans----- To reduce redundancy / duplicacy  and  the length of the code.
//        Get the information on Shadowing in java.


