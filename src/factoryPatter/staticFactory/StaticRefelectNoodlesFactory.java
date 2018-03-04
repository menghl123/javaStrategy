package factoryPatter.staticFactory;

import factoryPatter.model.Noodles;

// 通过传入反射创建面条类
public class StaticRefelectNoodlesFactory {
    // 传入Class实例化面条产品类
    public static <T extends Noodles>T createNoodles(Class<T> clazz) {
        T result = null;
        try {
            result = (T) Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){
            System.out.println(String.format("无当前苗条：",clazz.getName()));
            e.printStackTrace();
        }
        return result;
    }
}
