package p1;

public class Emp extends Person{
    public int eid;
    public int sal;
    public Emp(int eid,int sal,int age,String name){
        super(age, name);
        this.eid=eid;
        this.sal=sal;

//        this.age=age;
//        this.name=name;
    }
}
