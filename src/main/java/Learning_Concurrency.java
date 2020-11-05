public class Learning_Concurrency {
    public  static  void main(String[] args){
        Thread t1 = new Thread(()->{
            int a =0;
            while (a < 10){
                try {
                    System.out.print("+");
                    Thread.sleep(1000);
                    a++;
                }catch (InterruptedException ignor){ break;}
            }
        });

        t1.start();
        //t1.interrupt();
        System.out.println(t1.isInterrupted());
        System.out.println(Thread.activeCount());
    }
}
