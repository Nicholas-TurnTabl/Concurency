

import  java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class HelloThread {
    private static volatile boolean checkStatus = false;

    public  static  void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");
        Thread hello = new Thread(){
            @Override
            public void run() {
                while(!checkStatus){
                    System.out.println("Hello world");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException er){
                        break;
                    }
                }
            }
        };
        hello.start();

        TimeUnit.MILLISECONDS.sleep(5000);


        hello.interrupt();

        stopThread();
    }

   public static  void stopThread(){
        checkStatus = !checkStatus;
       System.out.println("Program terminated");
    }


}
