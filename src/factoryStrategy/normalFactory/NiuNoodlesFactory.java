package factoryStrategy.normalFactory;

import factoryStrategy.model.NiuNoodles;
import factoryStrategy.model.Noodles;

public class NiuNoodlesFactory extends NormalNoodlesFactory {
    @Override
    public Noodles create() {
        return new NiuNoodles();
    }
}
