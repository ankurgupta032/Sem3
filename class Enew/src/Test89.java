
// super must be the first statement of the every constructor......................
//invokation bottom to up
//execution top to bottom
class First{
    int num1;
    public First(int a){
        //super();
        System.out.println("First constructor"+a);
    }
}
class Second1 extends First{
    Second1(int b ,int c){
        //super();
        super(b);
        System.out.println("Second1 Constructor"+b+c);
    }
}
class Third extends Second1{
    Third(int ta,int tb,int tc,int td){
        //super();
        super(ta,tb);
        System.out.println("Third constructor"+ta+tb+tc+td);
    }
}
public class Test89 {
    public static void main(String[] args) {
        Third obj1=new Third(12,13,14,15);
    }
}
