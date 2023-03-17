package QUES_1;

public class ExtendsThread extends Thread {
    private String threadName;

    public ExtendsThread(String threadName){
        this.threadName = threadName ;
    }

    @Override
    public void run() {
        System.out.println(threadName + " is Running.");

        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ", Iteration " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
