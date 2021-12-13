package p1;

class one
{
    public int num1=90;
}
class two extends one
{
    int num1=67;
    public void display()
    {
        System.out.println(num1);
        System.out.println(super.num1);
    }
}
public class Test34 {
    public static void main(String[] args) {
        two obj1=new two();
//        obj1.display();
//        System.out.println(obj1.num1);
        System.out.println();
    }
}
//super cannot be used inside main method............