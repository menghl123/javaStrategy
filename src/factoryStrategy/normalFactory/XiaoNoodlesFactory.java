package factoryStrategy.normalFactory;

import factoryStrategy.model.NiuNoodles;
import factoryStrategy.model.Noodles;
import factoryStrategy.model.XiaoNoodles;

public class XiaoNoodlesFactory extends NormalNoodlesFactory {
    @Override
    public Noodles create() {
        return new XiaoNoodles();
    }
}
