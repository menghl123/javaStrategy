package strategyPatter.demo;

public class GoldenVipRole implements CalPrice {
    @Override
    public Double calPrice(final Double originPrice) {
        return originPrice * 0.7;
    }
}
