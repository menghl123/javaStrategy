package strategyPatter.demo;

public class Player {
    private Double totalAmount = 0D;// 消费总额
    private Double amount = 0D;// 单词消费总额
    private CalPrice calPrice = new NormalRole(); //初始为普通用户计算策略

    // 消费就会增加总额
    public void buy(final Double amount) {
        this.amount = amount;
        totalAmount += amount;
        if (totalAmount > 30000) {
            calPrice = new GoldenVipRole();
        } else if (totalAmount > 20000) {
            calPrice = new SuperVipRole();
        } else if (totalAmount > 10000) {
            calPrice = new VipRole();
        }
    }

    //计算客户用花的钱
    public Double calLastAmount() {
        return calPrice.calPrice(totalAmount);
    }
}
