package factoryPatter.staticFactory.app;

import factoryPatter.model.Noodles;
import factoryPatter.model.PaoNoodles;
import factoryPatter.staticFactory.StaticMethodsNoodlesFactory;
import factoryPatter.staticFactory.StaticNoodlesFactory;
import factoryPatter.staticFactory.StaticRefelectNoodlesFactory;

// 简单工厂模式 （1、不用反射 2、用反射 3、多方法工厂模式）
public class StaticFactoryApp {
    public static void main(String[] args) {
        // 1
        final Noodles niuNoodles = StaticNoodlesFactory.createNoodles(StaticNoodlesFactory.TYPE_NIU);
        niuNoodles.desc();

        // 2
        final Noodles paoNoodles = StaticRefelectNoodlesFactory.createNoodles(PaoNoodles.class);
        paoNoodles.desc();

        // 3
        final Noodles xiaoNoodles = StaticMethodsNoodlesFactory.createXiao();
        xiaoNoodles.desc();
    }
}
