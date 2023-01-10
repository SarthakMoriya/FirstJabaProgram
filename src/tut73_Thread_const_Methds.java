class myThr extends Thread{
    myThr(String name){
        super(name);
        System.out.println("myThr Class Constructor");
    }

    public void run(){
        System.out.println("Hello Im A Thread!");
    }
}

class MyThrRunnable implements  Runnable{
    public void run(){
        System.out.println("Hello woerld!");
    }
}
public class tut73_Thread_const_Methds {
    public static void main(String[] args) {
        myThr t1=new myThr("Sarthak");
        t1.start();
        System.out.println("Name of Thread T1:: "+t1.getName());
        System.out.println("Name of Thread T1:: "+t1.getId());

        MyThrRunnable t2=new MyThrRunnable();
        Thread t3=new Thread(t2,"Sarthak2");

        System.out.println("Runnable Thread Name:: "+t3.getName());
        System.out.println("Runnable Thread Id:: "+t3.getId());
    }
}
