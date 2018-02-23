package proxyStrategy.app;

import proxyStrategy.DynamicProxyFactory;
import proxyStrategy.UserDao;
import proxyStrategy.UserDaoImpl;

public class DynamicProxyApp {
    public static void main(String[] args) {
        //目标对象
        UserDaoImpl target = new UserDaoImpl();

        //原始的类型
        System.out.println(target.getClass());

        //创建代理对象
        UserDao proxy = (UserDao) new DynamicProxyFactory(target).getProxyInstance();
        //class $Proxy0 内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        proxy.get();//执行的是代理的方法
    }
}
