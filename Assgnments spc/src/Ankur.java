//Unnati chat Questions

//1-class Student {
//    String name;
//    Student (){
//        System.out.println("Unknown");
//    }
//    Student(String name){
//        this.name=name;
//        System.out.println(name);
//    }
//}
//class Ankur{
//    public static void main(String[] args) {
//        Student s1=new Student();
//        Student s2=new Student("Ankur");
//    }
//}

//
//2----//class book{
//    String name;
//    String author;
//    double price;
//    int stocks;
//
//    public book(String name, String author, double price, int stocks) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//        this.stocks = stocks;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getStocks() {
//        return stocks;
//    }
//}
//class Test{
//    public static void main(String[] args) {
//        book b1=new book("Ankur","Ravindra",22.8,9);
//        System.out.println(b1.getAuthor());
//        System.out.println(b1.getStocks());
//        System.out.println(b1.getPrice());
//        System.out.println(b1.getName());
//    }
//}

class room{
    boolean ac;
    boolean theatre;
    boolean fan;
    boolean light;

    public room(boolean ac, boolean theatre, boolean fan, boolean light) {
        this.ac = ac;
        this.theatre = theatre;
        this.fan = fan;
        this.light = light;
    }
    public void isOverload(){
        int load = 0;
        if(ac==true){
            load = load + 1200;
        }
        if(theatre == true){
            load = load + 600;
        }
        if(fan == true){
            load = load + 400;
        }
        if(light == true){
            load = load + 100;
        }
        if(load>=2000){
            System.out.println("Overload");
        }
        else{
            System.out.println("Not Overload");
        }
    }
}
class Ankur{
    public static void main(String[] args) {
        room r1=new room(false,true,true,true);
        r1.isOverload();
    }
}


