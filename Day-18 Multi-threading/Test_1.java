
package Traning;


class MyRunnable implements Runnable {
    public void run() {
        
    }
}

public class Test_1 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start(); 
    }
}

