package com.hua.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: Elon
 * @title: MethodInvocation
 * @projectName: Progressive-RPC-framework
 * @description:
 * @date: 2025/2/28 18:51
 */
public class MethodInvocation {

    private Object o;

    private Method method;

    public MethodInvocation(Object o,Method method){
        this.o = o;
        this.method = method;
    }

    public Object invoke(Object parameter) throws InvocationTargetException, IllegalAccessException {
        return method.invoke(o,parameter);
    }
}
