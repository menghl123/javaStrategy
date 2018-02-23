package proxyStrategy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//Cglib子类代理工厂
//对CglibDao在内存中动态创建一个子类对象
public class CglibProxyFactory implements MethodInterceptor {
    // 维护目标对象
    private Object target;

    public CglibProxyFactory(final Object target) {
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance() {
        //1.工具类
        Enhancer enhancer = new Enhancer();

        //2.设置父类
        enhancer.setSuperclass(target.getClass());

        //3.设置回调函数
        enhancer.setCallback(this);

        //4.创建子类（代理对象）
        return enhancer.create();
    }

    @Override
    public Object intercept(final Object o, final Method method, final Object[] objects, final MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务...");

        //执行目标对象的方法
        Object returnValue = method.invoke(target, objects);

        System.out.println("提交事务...");

        return returnValue;
    }
}
