package Ass1;

/*
1. Write a program to create interface named test.
 In this interface the member function is square. Implement this interface in arithmetic class.
Create one new class called ToTestInt in this class use the object of arithmetic class.
 */
public interface test {
    public abstract void square();
}
class arithmetic implements test{

    @Override
    public void square() {
        System.out.println(2*2);
    }
}
class Test57{
    public static void main(String[] args) {
        arithmetic obj=new arithmetic();
        obj.square();
    }
}

