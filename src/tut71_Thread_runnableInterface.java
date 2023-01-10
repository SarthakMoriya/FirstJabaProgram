class MyRunnableThread1 implements Runnable {
    public void run() {
        int i = 1;
        while (i < 500) {
            i++;
            System.out.println("Im am runnable thread 1");
        }
    }
}

class MyRunnableThread2 implements Runnable {
    public void run() {
        int i = 1;
        while (i < 500) {
            i++;
            System.out.println("Im am runnable thread two 2");
        }
    }
}

public class tut71_Thread_runnableInterface {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);
        gun1.start();

        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
    }

}
