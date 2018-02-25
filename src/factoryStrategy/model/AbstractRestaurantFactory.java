package factoryStrategy.model;
// 单点的抽象类
public abstract class AbstractRestaurantFactory {
    // 生产面条
    public abstract Noodles createNoodels();

    // 生产饮料
    public abstract Drinks createDrinks();
}
