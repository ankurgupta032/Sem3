package Ass2;
/*
Create class box and box3d. box3d is extended class of box. The above
two classes going to full fill following requirement
Include constructor.
set value of length, breadth, height Find out area and volume.
Note: Base class and sub classes have respective methods and instance variables.
 */

class outer
{
    public void display()
    {
        System.out.println("outer class");
    }

    // this class is nested class declared inside the outer class
    class inner
    {
        public void display()
        {
            System.out.println("inner class");
        }
    }
}
class Test68 {
    public static void main(String[] args) {
        outer obj = new outer();
        obj.display();

        outer.inner obj2 = obj.new inner();  // important statement kindly understant it carefully

        obj2.display();
    }
}
