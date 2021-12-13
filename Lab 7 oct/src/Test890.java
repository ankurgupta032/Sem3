class parent {
    public static void m1(){
        System.out.println("ok");
    }
}
class child extends parent {
    public  static void m1(){
        System.out.println("Welcome");
    }
}
public class Test890 {
    public static void main(String[] args) {
        child.m1();
    }
}
