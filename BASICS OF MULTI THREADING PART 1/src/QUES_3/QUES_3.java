package QUES_3;
//  3) WAP to showcase the usage of volatile in java.
public class QUES_3 {
    public static  int counter = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            int check = counter;
            while (check < 10){
                if(check != counter){
                    System.out.println("Thread 1 notice the Counter.");
                    check = counter;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            int check = counter;
            while (check < 10){
                System.out.println("Thread 2 Encounter value of: " + (check+1));
                counter = ++check;
                try{
                    Thread.sleep(500);
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
