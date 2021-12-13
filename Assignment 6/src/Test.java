//1-public interface Test {
//    public abstract void square();
//}
//class arithmetic implements Test{
//    @Override
//    public void square() {
//        System.out.println("Ankur");
//    }
//}
//class Ankur{
//    public static void main(String[] args) {
//        arithmetic a1=new arithmetic();
//        a1.square();
//    }
//}

//4---
//class Box {
//    private int length;
//    private int breadth;
//    public Box ( )
//    {
//        length =0;
//        breadth =0;
//    }
//    public Box (int x, int y)
//    {
//        length = x;
//        breadth =y;
//    }
//    public void setval (int x, int y) {
//        length = x;
//        breadth = y;
//    }
//    public int area ( )
//    {
//        return (length * breadth);
//    }
//}
//class Box3d extends Box
//{
//    private int height;
//    public Box3d ( )
//    {
//        super( );
//        height  = 0;
//    }
//    public Box3d(int x, int y, int z)
//    {
//        super (x, y);
//        height = z;
//    }
//    public void setval (int x, int y, int z)
//    {
//        setval(x, y);
//        height = z;
//    }
//    public int volume ( )
//    {
//        return (area ( ) * height );
//    }
//}
// class Test56 {
//    public static void main(String arga [ ])
//    {
//       Box obj1=new Box(10,20);
//        obj1.setval (10,20);
//        Box3d obj2 = new Box3d(30,40,50);
//        obj2.setval(30,40,50);
//        System.out.println(obj1.area());
//        System.out.println(obj2.volume());
//    }
//}

//2---
//class outer
//{
//    public void display()
//    {
//        System.out.println("outer class");
//    }
//
//    // this class is nested class declared inside the outer class
//    class inner
//    {
//        public void display()
//        {
//            System.out.println("inner class");
//        }
//    }
//}
//public class Test68 {
//    public static void main(String[] args) {
//        outer obj = new outer();
//        obj.display();
//
//        outer.inner obj2 = obj.new inner();  // important statement kindly understant it carefully
//
//        obj2.display();
//    }
//}
import java.util.Random;
abstract class Instrument {
    public abstract void play();
}
class Flute extends Instrument {

    @Override
    public void play() {
        System.out.println("Flute is playing  toot toot toot toot");

    }

}
class Guitar extends Instrument {

    @Override
    public void play() {
        System.out.println("Guitar is playing  tin  tin  tin");

    }

}
class Piano extends Instrument {

    @Override
    public void play() {
        System.out.println("Piano is playing  tan tan tan tan");

    }

}
 class Assignment3 {

public static void main(String[] args) {
        Instrument[] arr = new Instrument[10];
        Random r=new Random();

        for(int i=0;i<arr.length;i++){
            int randnum= r.nextInt(2);

        }

        }

        }
//
//import java.util.Random;
// abstract class Compartment {
//    public abstract void notice();
//}
// class FirstClass extends Compartment {
//
//    @Override
//    public void notice() {
//        System.out.println("Notice: You're in FirstClass");
//    }
//
//}
//class Ladies extends Compartment {
//
//    @Override
//    public void notice() {
//        System.out.println("Notice: You're in Ladies");
//    }
//
//}
//class General extends Compartment {
//
//    @Override
//    public void notice() {
//        System.out.println("Notice: You're in General");
//    }
//
//}
//class Luggage extends Compartment {
//
//    @Override
//    public void notice() {
//        System.out.println("Notice: You're in Luggage");
//    }
//
//}
//
// class TestCompartment {
//
//    public static void main(String[] args) {
//        Compartment[] compartments = new Compartment[1000];
//
//        Random rand = new Random();
//
//        for (int i = 0; i < 1000; i++) {
//            int randomNum = rand.nextInt((4 - 1) + 1) + 1;
//
//            if (randomNum == 1)
//                compartments[i] = new FirstClass();
//            else if (randomNum == 2)
//                compartments[i] = new Ladies();
//            else if (randomNum == 3)
//                compartments[i] = new General();
//            else if (randomNum == 4)
//                compartments[i] = new Luggage();
//
//            compartments[i].notice();
//        }
//    }
//}
Random rand = new Random();

        for (int i = 0; i < 10; i++) {
        int randomNum = rand.nextInt((3 - 1) + 1) + 1;

        if (randomNum == 1)
        instruments[i] = new Piano();
        else if (randomNum == 2)
        instruments[i] = new Flute();
        else if (randomNum == 3)
        instruments[i] = new Guitar();

        instruments[i].play();
        }

        for (int i = 0; i < 10; i++) {
        if (instruments[i] instanceof Piano)
        System.out.println("Piano is stored at index " + i);
        else if (instruments[i] instanceof Flute)
        System.out.println("Flute is stored at index " + i);
        else if (instruments[i] instanceof Guitar)
        System.out.println("Guitar is stored at index " + i);
        }