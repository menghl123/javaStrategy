package singletonStrategy;

// 懒汉加载，线程不安全
public class SingletonLazyStrategy {
    private static SingletonLazyStrategy instance;

    private SingletonLazyStrategy() {
    }

    public static SingletonLazyStrategy getInstance() {
        if (instance == null) {
            instance = new SingletonLazyStrategy();
        }
        return instance;
    }
}
