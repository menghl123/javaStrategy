package singletonStrategy;

// 饿汉加载，变种
public class SingletonHungerDiffStrategy {
    private static SingletonHungerDiffStrategy instance = null;

    static {
        instance = new SingletonHungerDiffStrategy();
    }

    private SingletonHungerDiffStrategy() {
    }

    public static SingletonHungerDiffStrategy getInstance() {
        return instance;
    }
}
