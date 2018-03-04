package strategyPatter.base.app;

import strategyPatter.base.Context;
import strategyPatter.base.Strategy;
import strategyPatter.base.StrategyA;
import strategyPatter.base.StrategyB;

public class BaseStrategyApp {
    public static void main(String[] args) {
        final Strategy strategyA = new StrategyA();
        final Context contextA = new Context(strategyA);
        contextA.contextInterface();

        final Strategy strategyB = new StrategyB();
        final Context contextB  = new Context(strategyB);
        contextB.contextInterface();
    }
}
