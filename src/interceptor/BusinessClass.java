package interceptor;

/**
 * Created by likun on 2018/2/23 0023.
 */
public class BusinessClass implements BusinessFacade {
    public void doSomething() {
        System.out.println("在业务组件 BusinessClass 中调用方法: doSomething()");
    }
}
