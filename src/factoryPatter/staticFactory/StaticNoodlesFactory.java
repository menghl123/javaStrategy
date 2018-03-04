package factoryPatter.staticFactory;

import factoryPatter.model.NiuNoodles;
import factoryPatter.model.Noodles;
import factoryPatter.model.PaoNoodles;
import factoryPatter.model.XiaoNoodles;

// 缺点是新增类是需要维护
public class StaticNoodlesFactory {
    public static final int TYPE_NIU = 1; // 牛肉面
    public static final int TYPE_PAO = 2; // 兰州拉面
    public static final int TYPE_XIAO = 3; // 重庆小面

    public static Noodles createNoodles(final int type){
        switch (type){
            case TYPE_NIU:
                return new NiuNoodles();
            case TYPE_PAO:
                return new PaoNoodles();
            case TYPE_XIAO:
            default:
                return new XiaoNoodles();
        }
    }
}
