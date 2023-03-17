package QUES_2;
//  2) Improve the code written in Basics of Multi Threading Part 1 exercise question 4
//      to handle the deadlock using reentrant lock.
public class QUES_2 {
    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount(100);
        System.out.println("Initial Balance: " + bankAccount.getBalance());
        Runnable depositTask = () -> {
            for(int i = 0 ; i < 10 ; i++){
                try {
                    bankAccount.deposit(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Current Balance: " + bankAccount.getBalance());
            }
        };
        Runnable withdrawTask = () -> {
            for(int i = 0 ; i < 10 ; i++){
                try {
                    bankAccount.withdraw(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Current Balance: " + bankAccount.getBalance());
            }
        };
        Thread t1 = new Thread(depositTask);
        Thread t2 = new Thread(withdrawTask);
        t1.start();
//        t1.join();
        t2.start();
//        t2.join();
    }
}
