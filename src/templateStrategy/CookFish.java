package templateStrategy;

public class CookFish extends CookTemplate {
    @Override
    protected void preCook() {
        System.out.println("10块钱买鱼");
    }

    @Override
    protected void cooking() {
        System.out.println("锅里煮鱼");
    }

    @Override
    protected void afterCook() {
        System.out.println("洗碗");
    }
}
