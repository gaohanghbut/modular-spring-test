package cn.yxffcode.modularspring.test;

import cn.yxffcode.modularspring.service.TestExtension;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author gaohang on 7/9/17.
 */
public class TestExtensionImpl implements TestExtension, InitializingBean {
  public void test() {
    System.out.println("test extension");
  }

  public void afterPropertiesSet() throws Exception {
    test();
  }
}
