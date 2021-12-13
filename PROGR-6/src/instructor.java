public class instructor extends Person{
    private double salary;

    public instructor(String n, int byear, double s)
    {
        super(n, byear);
        salary = s;
    }

    public String toString()
    {
        return "Employee[super=" + super.toString() + ",salary=" + salary + "]";
    }
}
