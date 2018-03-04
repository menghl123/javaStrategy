package factoryPatter.normalFactory;

import factoryPatter.model.Noodles;
import factoryPatter.model.PaoNoodles;

public class PaoNoodlesFactory extends NormalNoodlesFactory {
    @Override
    public Noodles create() {
        return new PaoNoodles();
    }
}
