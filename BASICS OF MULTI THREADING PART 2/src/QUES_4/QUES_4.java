package QUES_4;

import java.util.Random;
import java.util.concurrent.*;

//  4) WAP to return a random integer value from a thread execution using Future.
public class QUES_4 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3) ;

        for(int i = 0 ; i < 5 ; i++){
            Future<Integer> future = service.submit(new Task()) ;
            try{
                System.out.println(future.get());
            }catch (InterruptedException e){

            }catch (ExecutionException e){
                e.printStackTrace();
            }
        }

        service.shutdown();

    }

    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            try{
                System.out.println("Thread Working: " + Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return new Random().nextInt() ;
        }
    }

}
