
class MyThreadA extends Thread {
    //    public void run(){
//        while(true){
//            System.out.println("Thank You !");
//        }
//    }
    public void run() {
        while (true) {
            try {
                System.out.println("Thank You !");
                Thread.sleep(45);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThreadB extends Thread {
    public void run() {
        while (true) {
            System.out.println("Sarthak Thank You !");
        }
    }
}

public class tut75_Thread_Methods {
    public static void main(String[] args) {
        MyThreadA t1 = new MyThreadA();
        t1.start();
        MyThreadB t2 = new MyThreadB();

//        try {
            //Since t1.run() never ended our t2.run() never executed
//            t1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        t2.start();
    }
}
