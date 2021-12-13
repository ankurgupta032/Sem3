class mythread1  extends Thread{
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("My thread");
        }
        System.out.println(10/0);
    }
}
class test56{
    public static void main(String[] args) {
        mythread1 obj=new mythread1();
        Thread obj1=new mythread1();          //polynorphic ehaviour
        obj.start();
        for (int i=0;i<10;i++){
            System.out.println("main thread "+i);
        }
    }
}