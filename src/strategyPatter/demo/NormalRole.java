package strategyPatter.demo;

public class NormalRole implements CalPrice {
    @Override
    public Double calPrice(final Double originPrice) {
        return originPrice;
    }
}
