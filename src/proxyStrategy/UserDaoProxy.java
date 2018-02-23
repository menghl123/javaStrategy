package proxyStrategy;

//代理对象：静态代理
public class UserDaoProxy implements UserDao {
    // 目标对象
    private UserDao userDao;

    public UserDaoProxy(final UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("开始事务...");
        userDao.save();
        System.out.println("结束事务...");
    }

    @Override
    public void get() {

    }
}
