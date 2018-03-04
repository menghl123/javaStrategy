package strategyPatter.demo;
// 价格计算策略接口，会有 普通用户计算策略，vip用户策略，超级vip策略，金牌vip用户策略实现接口
public interface CalPrice {
    Double calPrice(final Double originPrice);
}
