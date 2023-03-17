package QUES_1;
import java.util.concurrent.*;
// 1) WAP to show usage of Callable and demonstrate how it is different from Runnable
public class QUES_1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10) ;

        System.out.println("Using Callable");

        Future<Integer> future = executorService.submit(new ImplementingCallable()) ;
        int result  = 0;
        try{
            result = future.get();
        }catch (InterruptedException e){
            System.out.println("Error In Getting value");
        }catch (ExecutionException e){
            System.out.println(e);
        }

        System.out.println("Result from future " +  result );

        // Running Form Runnable Interface
        System.out.println("Using Runnable");
        executorService.execute(new ImplementingRunnable());

        executorService.shutdown();


    }
    static class ImplementingCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Integer a = 21 ;
            try{
                System.out.println("Thread Working In callable");
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return a ;
//            return new Random().nextInt() ;
        }
    }

    static class ImplementingRunnable implements Runnable{
        @Override
        public void run(){
            try{
                System.out.println("With runnable And Not Able to Return value from Here");
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }
    }

}
