package strategyPatter.base;
// 具体策略B
public class StrategyB implements Strategy {
    @Override
    public void strategyInterface() {
        System.out.println("我是策略B");
    }
}
