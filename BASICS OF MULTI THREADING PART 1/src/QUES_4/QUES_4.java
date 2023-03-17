package QUES_4;
//  4) Write a code to simulate a deadlock in java.
public class QUES_4 {
    public static void main(String[] args) {
        final String resource1 = "Resource1";
        final String resource2 = "Resource2";
        // thread1 tries to lock resource1 then resource2
        Thread thread1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked " + resource1);

                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) { }

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked " + resource2);
                    }
                }
            }
        };

        // thread2 tries to lock resource2 then resource1
        Thread thread2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked " + resource2);

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) { }

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked " + resource1);
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}
