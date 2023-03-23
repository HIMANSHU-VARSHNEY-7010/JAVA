package QUES_4;

import java.util.Random;
import java.util.concurrent.*;

//  4) WAP to return a random integer value from a thread execution using Future.
public class QUES_4 {
    public static void main(String[] args) {
        int countProcessor = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(countProcessor) ;

        for(int i = 0 ; i < 5 ; i++){
            Future<Integer> future = service.submit(new Task()) ;
            try{
                System.out.println(future.get());
            }catch (InterruptedException e){

            }catch (ExecutionException e){
                e.printStackTrace();
            }
            if(i==4) System.out.println("Future Completed.");
        }

        service.shutdown();
        System.out.println("Service ShutDown.");

    }

    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            try{
                System.out.println("Thread Working: " + Thread.currentThread().getName());
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return new Random().nextInt() ;
        }
    }

}
