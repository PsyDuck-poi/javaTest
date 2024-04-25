package thread_t;

public class Thread_Test extends Thread {

    public static int ticket=100;
    public static Object lock=new Object();

    public Thread_Test(String threadName){
        super(threadName);
    }

    //重写run方法
    public synchronized void run() {

            while(ticket>0) {

                synchronized (lock) {

                    System.out.println(Thread.currentThread().getName() + ":已售卖第" + (100-ticket+1) + "张票");
                    ticket--;
                }
                try {
                    Thread.sleep(20);
                    //lock.wait(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                //lock.notify();
            }
    }

    public static void main(String[] args) {
        Thread_Test thread01=new Thread_Test("1号售票窗口");
        Thread_Test thread02=new Thread_Test("2号售票窗口");
        Thread_Test thread03=new Thread_Test("3号售票窗口");
        Thread_Test thread04=new Thread_Test("4号售票窗口");
        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();
    }
}
