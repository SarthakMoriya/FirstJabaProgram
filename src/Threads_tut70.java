import java.util.Scanner;

class MyThread extends  Thread{
    public void run(){
        while(true){
            System.out.println("My Cooking Thread Is Running!");
        }
    }
}
class MyThread2 extends  Thread{
    public void run(){
        while(true){
            System.out.println("My Chatting Thread Is Running!");
        }
    }
}

class MyThread3 extends  Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.next();
        System.out.println("Name::"+name);

    }
}
class MyThread4 extends  Thread{
    public void run(){
        int i=1;
        while(i<4000){
            System.out.println("Thread Running!");
            i++;
        }
    }
}

public class Threads_tut70 {
    public static void main(String[] args) {
//        MyThread t1=new MyThread();
//        MyThread2 t2 =new MyThread2();

//        t1.start();
//        t2.start();
        MyThread3 t3=new MyThread3();
        MyThread4 t4 =new MyThread4();

        t4.start();
        t3.start();
    }
}
