class MyThreadX extends Thread {
    MyThreadX(String name){
        super(name);
    }
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("Good Morning!");
            i++;
        }
    }
}

class MyThreadY extends Thread {
    MyThreadY(String name){
        super(name);
    }
    public void run() {
        int i=0;

        while (i<100) {
            System.out.println("Welcome!");
            i++;
        }
    }
//    public void run() {
//        int i=0;
//        while (i<5000) {
//            try {
//                System.out.println("Thank You !");
//                Thread.sleep(45);
//                i++;
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}

public class tut76_Threads_Practise_Set {
    public static void main(String[] args) {
        MyThreadX t1 = new MyThreadX("T1");
        MyThreadY t2 = new MyThreadY("T2");

        //SETTING PRIORITY
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

        //GETTING PRIORITY
        System.out.println("Priority of Thread T1:: "+t1.getPriority());
        System.out.println("Priority of Thread T2:: "+t2.getPriority());
        System.out.println("State of T2:: "+t2.getState());
        System.out.println("State of T1:: "+t1.getState());
        System.out.println("State of T2:: "+t2.getState());
        System.out.println("State of T1:: "+t1.getState());
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(Thread.currentThread());
    }
}

