/*Q1) Write a program to create a class named shape.
It should contain 2 methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively.
*/
class shape {
    void draw() {
        System.out.println("Drawing Shape");
        ;
    }

    void erase() {
        System.out.println("erase");
    }
}
    class ankur{
        public static void main(String[] args) {
            shape obj1=new shape();
            obj1.draw();
            obj1.erase();
        }
    }






