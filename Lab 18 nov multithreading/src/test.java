class mythread extends Thread {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        t.setName("Ankur");
        System.out.println(t.isAlive());      //boolean value is the thread alive or not.
        System.out.println(t.getName());     //name of the thread
        System.out.println(t.isDaemon());
        System.out.println(t.getPriority());
        t.setPriority(8);
        System.out.println(t.getPriority());
        t.setPriority(Thread.MIN_PRIORITY);      //set the priority.
        System.out.println(t.getId());
        System.out.println(t.getState());
        System.out.println(10/0);             //daemmon thrtead are the low priority thread .
    }

}
