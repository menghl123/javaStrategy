package proxyPatter.app;

import proxyPatter.CglibDao;
import proxyPatter.CglibProxyFactory;

public class CglibProxyApp {

//    @Test
    public  void test() {
        //目标对象
        CglibDao target = new CglibDao();

        //创建代理对象
        CglibDao proxy = (CglibDao) new CglibProxyFactory(target).getProxyInstance();
        //class $Proxy0 内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        proxy.save();//执行的是代理的方法
    }
}
