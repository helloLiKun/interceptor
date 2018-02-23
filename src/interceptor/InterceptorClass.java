package interceptor;

/**
 * Created by likun on 2018/2/23 0023.
 */
public class InterceptorClass {
    // 在 action 之前调用
    public void before(){
        System.out.println("在拦截器 InterceptorClass 中调用方法: before()");
    }

    // 在 action 之后调用
    public void after(){
        System.out.println("在拦截器 InterceptorClass 中调用方法: after()");
    }
}
