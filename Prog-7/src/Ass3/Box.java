package Ass3;

class Box {
    private int length;
    private int breadth;

    public Box ( )
    {
        length =0;
        breadth =0;
    }
    public Box (int x, int y)
    {
        length = x;
        breadth =y;
    }
    public void setval (int x, int y) {
        length = x;
        breadth = y;
    }
    public int area ( )
    {
        return (length * breadth);
    }
}
class Box3d extends Box
{
    private int height;
    // non parameterised constructor
    public Box3d ( )
    {
        // constructor chaining

        super( ); // used to invoke the constructor of the immediate base class (optional)
        height  = 0;
    }
    // parameterised constructor
    public Box3d(int x, int y, int z)
    {
        super (x, y); // used to invoke the constructor of the parent class (mendatory)
        height = z;
    }
    // setter method to set the value
    public void setval (int x, int y, int z)
    {
        setval(x, y);  // nesting of methods (when a method called inside the body of another method is called nesting
        height = z;
    }
    // method to calculate volume
    public int volume ( )
    {
        return (area ( ) * height );
    }
}
class Test56 {
    public static void main(String arga [ ])
    {
        Box obj1=new Box();  // parent class object
        obj1.setval (10,20);  // used to initialize the attributes of the parent class
        Box3d obj2 = new Box3d(30,40,50); // child class object creation by using parameterised constructor
        System.out.println(obj1.area());
        System.out.println(obj2.volume());
    }
}

