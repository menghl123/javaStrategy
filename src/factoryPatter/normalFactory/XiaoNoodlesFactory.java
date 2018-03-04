package factoryPatter.normalFactory;

import factoryPatter.model.Noodles;
import factoryPatter.model.XiaoNoodles;

public class XiaoNoodlesFactory extends NormalNoodlesFactory {
    @Override
    public Noodles create() {
        return new XiaoNoodles();
    }
}
