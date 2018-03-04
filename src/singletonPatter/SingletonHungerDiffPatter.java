package singletonPatter;

// 饿汉加载，变种
public class SingletonHungerDiffPatter {
    private static SingletonHungerDiffPatter instance = null;

    static {
        instance = new SingletonHungerDiffPatter();
    }

    private SingletonHungerDiffPatter() {
    }

    public static SingletonHungerDiffPatter getInstance() {
        return instance;
    }
}
