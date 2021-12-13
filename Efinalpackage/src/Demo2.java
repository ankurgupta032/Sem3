//getter and setter method {Important}
class Emp{
    private int id;
    private int sal;
    //getter and setter methods.
    void setValue()
    {
        this.id=55;
        this.sal=200;
    }
    int getId(){
        return this.id;
    }
    int getSal(){
        return this.sal;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        //display the values of id and sal..
        Emp obj1=new Emp();
        obj1.setValue();
        System.out.println(obj1.getId());
        System.out.println(obj1.getSal());


    }
}


//getter and setter method {Important}..
class Emp{
    private int id;
    private int sal;
    //getter and setter methods.
    void setValue(int i,int j)
    {
        this.id=i;
        this.sal=j;
    }
    int getId(){
        return this.id;
    }
    int getSal(){
        return this.sal;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        //display the values of id and sal..
        Emp obj1=new Emp();
        obj1.setValue(3,4);
        System.out.println(obj1.getId());
        System.out.println(obj1.getSal());


    }
}
