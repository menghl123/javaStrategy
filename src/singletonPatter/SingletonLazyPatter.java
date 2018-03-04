package singletonPatter;

// 懒汉加载，线程不安全
public class SingletonLazyPatter {
    private static SingletonLazyPatter instance;

    private SingletonLazyPatter() {
    }

    public static SingletonLazyPatter getInstance() {
        if (instance == null) {
            instance = new SingletonLazyPatter();
        }
        return instance;
    }
}
