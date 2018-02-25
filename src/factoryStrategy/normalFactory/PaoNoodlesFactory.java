package factoryStrategy.normalFactory;

import factoryStrategy.model.NiuNoodles;
import factoryStrategy.model.Noodles;
import factoryStrategy.model.PaoNoodles;

public class PaoNoodlesFactory extends NormalNoodlesFactory {
    @Override
    public Noodles create() {
        return new PaoNoodles();
    }
}
