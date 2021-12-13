package p1;

public class Stu extends Person {
    int marks;
    int rollno;
    public Stu(int marks, int rollno,int age,String name) {
        super(age, name);
        this.marks = marks;
        this.rollno = rollno;
//        this.age=age;
//        this.name=name;
    }
}
