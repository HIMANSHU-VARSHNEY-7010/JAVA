package QUES_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//  5) WAP to showcase the difference between shutdown() and shutdownNow().
public class QUES_5 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Task());
        service.execute(new Task());

        System.out.println("isTerminated " + service.isTerminated());
        System.out.println("ShutDown()");
        service.shutdown();

        // ShutDownNow
        // similar to shut down But Running Thread is Interrupted

        System.out.println("isTerminated " + service.isTerminated());
        System.out.println("ShutDownNow()");
        service.shutdownNow();
        System.out.println("isTerminated " + service.isTerminated());
        service.close();
        System.out.println("isTerminated " + service.isTerminated());

    }

    static class Task implements Runnable{
        public void run(){
            try{
                System.out.println("Thread: " + Thread.currentThread().getName() + " is working");
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Thread Interrupted By ShutDownNow()");
                }
                Thread.sleep(2000);

            }catch (InterruptedException e){
                e.printStackTrace() ;
            }finally {
                System.out.println("Thread: " + Thread.currentThread().getName() + " is Leaving ");
            }
        }
    }
}
