package factoryStrategy.model;

public class KfcRestaurant extends AbstractRestaurantFactory {
    @Override
    public Noodles createNoodels() {
        return new XiaoNoodles();
    }

    @Override
    public Drinks createDrinks() {
        return new WaterDrinks();
    }
}
