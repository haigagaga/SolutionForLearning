public class Single {

    private static volatile Single single;

    private Single(){}

    public static Single getInstance(){
        if (single == null) {
            synchronized (Single.class) {
                if (single == null) {
                    single = new Single();
                }
            }
        }
        return single;
    }


    //A--->   Single.getInstance()   ----> 拿到锁了 进到了        -----> 判断为空，new Single()，返回single，释放锁
    //B--->   Single.getInstance()   ----> 没拿到锁，等待A释放锁                                                 ------->拿到锁，进去发现single不等于null，直接返回。
}
