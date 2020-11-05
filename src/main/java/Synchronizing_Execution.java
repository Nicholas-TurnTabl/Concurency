import java.util.Random;

public class Synchronizing_Execution{

    private static int thread_size = 5;
    private static Thread[] threads = new Thread[thread_size];
    public static void main(String[] args) throws InterruptedException {
        for (int i =0; i < thread_size; i++){
            threads[i] = new Thread(new Threads());
        }

        for(Thread thread : threads){
            int n = getRandomNumber(1,5);
            thread.start();
            Thread.sleep(n * 1000);

        }
    }

static  int getRandomNumber (int min , int max){
    Random rd = new Random();
    return  rd.nextInt(max -min) + min;
}
}


class Threads extends  Thread implements Runnable{
    @Override
    public void run() {
        System.out.println(super.getName());
    }
}





