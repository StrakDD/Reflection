package ua.reflection.task;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Denis Starovoitenko on 29.08.2017.
 */
public class Proxy implements InvocationHandler {
    private Object object;

    public Proxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")){
            return method.invoke(object, args);
        }

        if (method.getName().startsWith("set")){
            throw new IllegalArgumentException();
        }

        return object;
    }
}
