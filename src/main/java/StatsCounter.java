import java.util.concurrent.atomic.AtomicInteger;

public final class StatsCounter {

    //private AtomicInteger successCount_ = new AtomicInteger(0);
        private  static volatile  int successCount_;
//     public final int getSuccessCount() {
//        return successCount_.get();
//    }
//    public final void increaseSuccessCount(int delta) {
//         successCount_.addAndGet(delta);
//    }

       synchronized public final int getSuccessCount() {
        return successCount_;
    }
    synchronized public final void increaseSuccessCount(int delta) {
         successCount_+=delta;
    }
}