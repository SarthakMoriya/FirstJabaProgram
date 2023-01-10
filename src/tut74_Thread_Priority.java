class MyThr1 extends Thread {
    MyThr1(String name) {
        super(name);
    }

    public void run() {
//        while (true)
            System.out.println("Thread with Name :: " + this.getName());
    }
}

public class tut74_Thread_Priority {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("T1");
        MyThr1 t2 = new MyThr1("T2");
        MyThr1 t3 = new MyThr1("T3");
        MyThr1 t4 = new MyThr1("T4");
        MyThr1 t5 = new MyThr1("T5");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
//        t4.setPriority(Thread.MIN_PRIORITY);
//        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
