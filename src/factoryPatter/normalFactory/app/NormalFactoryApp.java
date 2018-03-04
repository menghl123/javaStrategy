package factoryPatter.normalFactory.app;

import factoryPatter.model.Noodles;
import factoryPatter.normalFactory.NiuNoodlesFactory;
import factoryPatter.normalFactory.NormalNoodlesFactory;
import factoryPatter.normalFactory.PaoNoodlesFactory;
import factoryPatter.normalFactory.XiaoNoodlesFactory;

// 普通工厂就是把简单工厂中具体的工厂类，划分成两层：抽象工厂层+具体的工厂子类层。（一般->特殊）
// 会多new一个工厂类
public class NormalFactoryApp {
    public static void main(String[] args) {
        // 1
        NormalNoodlesFactory niuNoodlesFactory = new NiuNoodlesFactory();
        final Noodles niuNoodles = niuNoodlesFactory.create();
        niuNoodles.desc();

        // 2
        final PaoNoodlesFactory paoNoodlesFactory = new PaoNoodlesFactory();
        final Noodles paoNoodles = paoNoodlesFactory.create();
        paoNoodles.desc();

        // 3
        final XiaoNoodlesFactory xiaoNoodlesFactory = new XiaoNoodlesFactory();
        final Noodles xiaoNoodles = xiaoNoodlesFactory.create();
        xiaoNoodles.desc();
    }
}
