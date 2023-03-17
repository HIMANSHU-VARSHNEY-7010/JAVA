package QUES_3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
//  3) Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool()
//      to submit a list of tasks and wait for completion of all tasks.
public class QUES_3 {
    public static void main(String[] args) {
        System.out.println("Using newCachedThreadPool()");
        ExecutorService service1 = Executors.newCachedThreadPool();
        // automatically creates threads if all threads are in use
        for(int i = 0 ; i < 5 ; i++){
            service1.execute(new Task());
        }
        service1.shutdown();

        System.out.println("Using newSingleThreadExecutor()");

        ExecutorService service2 = Executors.newSingleThreadExecutor();
        // runs only one thread so task runs sequentially as input
        for(int i = 0 ; i < 5 ; i++){
            service2.execute(new Task());
        }
        service2.shutdown();

        System.out.println("Using newFixedThreadPool()");
        ExecutorService service3 = Executors.newFixedThreadPool(2);
        for(int i = 0 ; i < 5 ; i++){
            service3.execute(new Task());
        }
        service3.shutdown();
    }

    static class Task implements Runnable{

        public void run(){
            try{
                System.out.println(Thread.currentThread().getName() + " is Running.");
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                System.out.println(Thread.currentThread().getName() + " is Exiting.");
            }
        }
    }
}
