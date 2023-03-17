package QUES_2;
//  2) Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to
//      access method at same time.
public class QUES_2 {
    public static void main(String[] args) throws InterruptedException {
        final SyncTest syncTest = new SyncTest();

        Thread thread1 = new Thread() {
            public void run() {
                syncTest.test();
//                syncTest.test1();
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
//                syncTest.test();
                syncTest.test1();
            }
        };
        thread1.start();
        thread2.start();
        thread2.join();

        System.out.println("-----------------StaticSyncBlock-----------------");

        final SyncStaticBlock syncStaticBlock = new SyncStaticBlock();

        Thread thread3 = new Thread() {
            public void run() {
                syncStaticBlock.test();
//                syncStaticBlock.test1();
            }
        };
        Thread thread4 = new Thread() {
            public void run() {
//                syncStaticBlock.test();
                syncStaticBlock.test1();
            }
        };

        thread3.start();
        thread4.start();
    }
}
