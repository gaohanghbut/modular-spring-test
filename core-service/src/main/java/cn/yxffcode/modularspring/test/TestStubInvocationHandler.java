package cn.yxffcode.modularspring.test;

import com.google.common.reflect.AbstractInvocationHandler;

import java.lang.reflect.Method;

/**
 * @author gaohang on 7/16/17.
 */
public class TestStubInvocationHandler extends AbstractInvocationHandler {
  protected Object handleInvocation(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("stub auto proxy success");
    return null;
  }
}
