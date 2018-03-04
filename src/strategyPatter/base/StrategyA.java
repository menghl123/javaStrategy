package strategyPatter.base;
// 具体策略A
public class StrategyA implements Strategy {
    @Override
    public void strategyInterface() {
        System.out.println("我是策略A");
    }
}
