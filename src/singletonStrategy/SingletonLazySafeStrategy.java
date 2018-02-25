package singletonStrategy;

// 懒汉加载，线程安全
public class SingletonLazySafeStrategy {
    private static SingletonLazySafeStrategy instance;

    private SingletonLazySafeStrategy() {
    }

    public static synchronized  SingletonLazySafeStrategy getInstance() {
        if (instance == null) {
            instance = new SingletonLazySafeStrategy();
        }
        return instance;
    }
}
