package strategyPatter.demo;

public class VipRole implements CalPrice {
    @Override
    public Double calPrice(final Double originPrice) {
        return originPrice * 0.9;
    }
}
