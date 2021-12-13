//passing of an array to an argument to a method.............
/*class Stu{
    int rollno;
    int arr[];

    public Stu(int rollno, int[] arr) {
        this.rollno = rollno;
        this.arr = arr;
    }
    public void display(){
        System.out.println(rollno);
        for(int res:arr){
            System.out.println(res);
        }
    }
}
//deep copy and shallow copy
//cloning method                           {Important topic}
//big integer (dynammically store the memory)
public class Demo1 {
    public static void main(String[] args) {
        Stu obj1=new Stu(23,new int[]{23_000,56,78,90});
        obj1.display();
    }
}
*/
//all the method are made static

class Stu{
     static int rollno;
     static int arr[];

    public static void Stu(int rollno1, int[] arr1) {
        rollno = rollno1;
        arr = arr1;
    }
    public static void display(){
        System.out.println(rollno);
        for(int res:arr){
            System.out.println(res);
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Stu.Stu(23,new int[]{12,56,78,90});
        Stu.display();
    }
}
