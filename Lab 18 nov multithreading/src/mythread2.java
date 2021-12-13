//class mythread2 implements Runnable{
//    @Override
//    public void run() {
//        Thread.currentThread().setName("E custom thread");
//        for (int i=0;i<10;i++){
//            System.out.println(Thread.currentThread().getName());
//        }
//    }
//}
//class test57{
//    public static void main(String[] args) {
//        Thread t= new Thread(() -> {
//            Thread.currentThread().setName("E custom thread");
//            for (int i = 0; i < 10; i++) {
//                System.out.println(Thread.currentThread().getName());
//            }
//
//        });
//        t.start();
//        for (int i=0;i<10;i++){
//            System.out.println("main thread");
//        }
//    }
//}
//import java.util.*;
//class mythread5 extends Thread{
//    static Thread a;
//    public void run(){
//        try{
//            a.join();
//        }
//        catch(InterruptedException e){
//            System.out.println("Thread is caught");
//        }
//        for (int i=0;i<5;i++){
//            System.out.println("child thread");
//        }
//    }
//
//}
//class ankur{
//    public static void main(String[] args) throws InterruptedException {
//        mythread5.a=Thread.currentThread();
//        mythread5 t=new mythread5();
//        t.start();
//        for (int i=0;i<5;i++){
//            System.out.println("main thread");
//        }
//    }
//}
import java.util.*;
class display {
    public static synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
    }
}
class mythrea extends Thread{
    display d;
    String name;
    mythrea (display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}
class teat{
    public static void main(String[] args) {
        display d=new display();
        mythrea t1=new mythrea(d,"Dhoni");
        mythrea t2=new mythrea(d,"Yuvraj");
        t1.start();
        t2.start();
    }
}



