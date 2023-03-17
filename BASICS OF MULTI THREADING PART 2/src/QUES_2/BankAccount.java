package QUES_2;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount extends Thread {
    private int Balance;
    private ReentrantLock lock = new ReentrantLock();
    BankAccount(int Balance){
        this.Balance = Balance;
    }
    public void deposit(int amount) throws InterruptedException {
        lock.lock();
        Thread.sleep(200);
        System.out.println("Thread " + Thread.currentThread().getName() + " Locked.");
        Balance += amount;
        System.out.println("Thread " + Thread.currentThread().getName() + " Unlocked.");
        lock.unlock();
    }
    public void withdraw(int amount) throws InterruptedException {
        try {lock.lock();
            Thread.sleep(200);
            System.out.println("Thread " + Thread.currentThread().getName() + " Locked.");
            if(Balance < amount){
                throw new IllegalArgumentException("Insufficient Balance.");
            }
            Balance -= amount;
        }finally{
            System.out.println("Thread " + Thread.currentThread().getName() + " Unlocked.");
            lock.unlock();
        }
    }
    public int getBalance(){
        return Balance;
    }
}

