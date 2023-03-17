package QUES_2;

public class SyncTest {

    synchronized public void test(){
        try{
            System.out.println("Thread: " + Thread.currentThread().getName() + " Entered.");
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Thread: " + Thread.currentThread().getName() + " Leaving.");

        }
    }
    synchronized public void test1(){
        try{
            System.out.println("t1_Thread: " + Thread.currentThread().getName() + " Entered.");
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("t1_Thread: " + Thread.currentThread().getName() + " Leaving.");

        }
    }
}