package singletonPatter;

// 懒汉加载，线程安全
public class SingletonLazySafePatter {
    private static SingletonLazySafePatter instance;

    private SingletonLazySafePatter() {
    }

    public static synchronized SingletonLazySafePatter getInstance() {
        if (instance == null) {
            instance = new SingletonLazySafePatter();
        }
        return instance;
    }
}
