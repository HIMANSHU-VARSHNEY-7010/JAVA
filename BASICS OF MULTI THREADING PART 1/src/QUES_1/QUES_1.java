package QUES_1;
//  1) Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and
//     join methods in the created threads.
public class QUES_1 {
    private static ImplementsRunnable r1;

    public static void main(String[] args) {
        System.out.println("q1");


        ExtendsThread th1 = new ExtendsThread("Thread1");
        ExtendsThread th2 = new ExtendsThread("Thread2");
        ExtendsThread th3 = new ExtendsThread("Thread3");

        ImplementsRunnable r1 = new ImplementsRunnable("Th1");
        ImplementsRunnable r2 = new ImplementsRunnable("Th2");
        ImplementsRunnable r3 = new ImplementsRunnable("Th3");

        Thread t1 = new Thread(r1) ;
        Thread t2 = new Thread(r2) ;
        Thread t3 = new Thread(r3) ;

        th1.start();
        try{
            th1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th2.start();
        try{
            th2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th3.start();
        try{
            th3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        try{
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t3.start();

    }
}
