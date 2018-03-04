package factoryPatter.normalFactory;

import factoryPatter.model.NiuNoodles;
import factoryPatter.model.Noodles;

public class NiuNoodlesFactory extends NormalNoodlesFactory {
    @Override
    public Noodles create() {
        return new NiuNoodles();
    }
}
