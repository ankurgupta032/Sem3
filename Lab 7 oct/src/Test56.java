//class i1
//{
//
//}
//class i2 extends i1
//{
//
//}
//class i3 extends i2{
//
//}
interface i1
{

}
interface i2 extends i1
{

}
interface i3 extends i1
{

}

class Overdemo{
    public void m1(i1 obj1){
        System.out.println("hello");
    }
    public void m1(i2 obj1){
        System.out.println("Gla");
    }
    public void m1(i3 obj1){
        System.out.println("welcome to gla");
    }
}
public class Test56 {
    public static void main(String[] args) {
//        new Overdemo().m1(null);
          Overdemo obj5=null;
    }
}









