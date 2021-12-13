//
interface i1  //till java 1.7 version......................................
{
    public static final int a = 0;
    public abstract void m1();
}
//class one implements i1{         //implements keyword ...................
//    @Override
//    public void m1() {
//        System.out.println("hello");
//    }
//}

                                    //Annonymous object...............
public class Testing3 {
    public static void main(String[] args) {
//        one obj1=new one();
//        obj1.m1();
        i1 obj=new i1() {
            @Override
            public void m1() {
                System.out.println("welcome to java class");
            }
        };
        obj.m1();
    }
}
