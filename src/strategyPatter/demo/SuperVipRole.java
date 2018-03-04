package strategyPatter.demo;

public class SuperVipRole implements CalPrice {
    @Override
    public Double calPrice(final Double originPrice) {
        return originPrice * 0.8;
    }
}
