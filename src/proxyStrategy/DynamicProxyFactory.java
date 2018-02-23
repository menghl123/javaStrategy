package proxyStrategy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//创建动态代理对象
//动态代理不需要实现接口，但是需要指定接口类型
public class DynamicProxyFactory {
    //维护一个目标对象
    private Object target;

    public DynamicProxyFactory(final Object object) {
        this.target = object;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
                        System.out.println("开始事务...");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target,args);
                        System.out.println("结束事务...");
                        return returnValue;
                    }
                }
        );
    }
}
