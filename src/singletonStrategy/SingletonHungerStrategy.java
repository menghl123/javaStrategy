package singletonStrategy;

// 饿汉加载
public class SingletonHungerStrategy {
    private static SingletonHungerStrategy instance = new SingletonHungerStrategy();

    private SingletonHungerStrategy() {
    }

    public static SingletonHungerStrategy getInstance() {
        return instance;
    }
}
