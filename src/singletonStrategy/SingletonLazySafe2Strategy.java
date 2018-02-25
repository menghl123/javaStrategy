package singletonStrategy;

// 懒汉加载，线程安全进阶版本
public class SingletonLazySafe2Strategy {
    // 个人理解：当当前类被锁住的时候，instance依然能够保持可见性，所以用了volatile
    private volatile static SingletonLazySafe2Strategy instance;

    private SingletonLazySafe2Strategy() {
    }

    public static SingletonLazySafe2Strategy getInstance() {
        if (instance == null) {
            synchronized (SingletonLazySafe2Strategy.class) {
                if (instance == null) {
                    instance = new SingletonLazySafe2Strategy();
                }
            }
        }
        return instance;
    }
}
