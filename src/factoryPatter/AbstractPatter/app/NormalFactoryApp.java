package factoryPatter.AbstractPatter.app;

import factoryPatter.model.AbstractRestaurantFactory;
import factoryPatter.model.ChengduRestaurant;
import factoryPatter.model.Drinks;
import factoryPatter.model.KfcRestaurant;
import factoryPatter.model.Noodles;

/**
 * 抽象工厂方法：
 */
public class NormalFactoryApp {
    public static void main(String[] args) {
       // 成都大酒店生产牛肉面和可乐
        final AbstractRestaurantFactory chengduRestaurant = new ChengduRestaurant();
        final Drinks drinks = chengduRestaurant.createDrinks();
        final Noodles noodels = chengduRestaurant.createNoodels();
        drinks.princes();
        noodels.desc();

        // KFC生产重庆小面和水
        final AbstractRestaurantFactory kfcRestaurant = new KfcRestaurant();
        final Drinks drinks1 = kfcRestaurant.createDrinks();
        final Noodles noodels1 = kfcRestaurant.createNoodels();
        drinks1.princes();
        noodels1.desc();
    }
}
