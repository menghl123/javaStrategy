package singletonPatter;

// 饿汉加载
public class SingletonHungerPatter {
    private static SingletonHungerPatter instance = new SingletonHungerPatter();

    private SingletonHungerPatter() {
    }

    public static SingletonHungerPatter getInstance() {
        return instance;
    }
}
