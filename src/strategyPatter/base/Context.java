package strategyPatter.base;

// 环境角色类
public class Context {
    // 持有一个具体的策略对象
    private Strategy strategy;

    // 传入一个具体的策略对象
    public Context(final Strategy strategy) {
        this.strategy = strategy;
    }

    //策略方法
    public void contextInterface() {
        this.strategy.strategyInterface();
    }
}
