package factoryPatter.model;

public class ChengduRestaurant extends AbstractRestaurantFactory {
    @Override
    public Noodles createNoodels() {
        return new NiuNoodles();
    }

    @Override
    public Drinks createDrinks() {
        return new ColaDrinks();
    }
}
