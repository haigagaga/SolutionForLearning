package 多线程;

public class 多线程并发同步test {

    public final static Object object = new Object();
    static long l  = 1000 ;

    public static void main(String[] args) throws InterruptedException {
        sync();
        synchronized (object){
            object.wait();
        }
        System.out.println("sync "+ l);
    }

    public static void sync() throws InterruptedException {
        async(new CallBack() {
            @Override
            public void call(long data) {
                l = data;
                System.out.println("call: " + l);
                synchronized (object){
                    object.notify();
                }
            }
        });
    }
    public static void async(CallBack callBack) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                long l = System.currentTimeMillis();
                System.out.println("async : " + l);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                callBack.call(l);
            }
        }).start();

    }

    public interface CallBack{
        void call(long data);
    }

}
