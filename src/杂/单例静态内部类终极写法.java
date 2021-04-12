package 杂;

public class 单例静态内部类终极写法 {

    //不仅能确保线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
    private 单例静态内部类终极写法(){}

    public static Object geto(){
        return Holder.o;
    }
    public static Object getj(){
        return Holder.j;
    }

    private static class Holder{
        private static final Object o = new Object();
        private static final Object j = new Object();
    }

}
