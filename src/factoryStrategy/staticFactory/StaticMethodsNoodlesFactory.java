package factoryStrategy.staticFactory;

import factoryStrategy.model.NiuNoodles;
import factoryStrategy.model.Noodles;
import factoryStrategy.model.PaoNoodles;
import factoryStrategy.model.XiaoNoodles;

// 多方法工厂模式，模仿 jdk里的Executors 类
// 多一个种类，就增加一个createXX方法
public class StaticMethodsNoodlesFactory {

    public static Noodles createNiu(){
        return new NiuNoodles();
    }

    public static Noodles createPao(){
        return new PaoNoodles();
    }

    public static Noodles createXiao(){
        return new XiaoNoodles();
    }
}
