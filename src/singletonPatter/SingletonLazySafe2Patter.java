package singletonPatter;

// 懒汉加载，线程安全进阶版本
public class SingletonLazySafe2Patter {
    // 个人理解：当当前类被锁住的时候，instance依然能够保持可见性，所以用了volatile
    private volatile static SingletonLazySafe2Patter instance;

    private SingletonLazySafe2Patter() {
    }

    public static SingletonLazySafe2Patter getInstance() {
        if (instance == null) {
            synchronized (SingletonLazySafe2Patter.class) {
                if (instance == null) {
                    instance = new SingletonLazySafe2Patter();
                }
            }
        }
        return instance;
    }
}
