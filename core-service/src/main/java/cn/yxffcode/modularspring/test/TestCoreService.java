package cn.yxffcode.modularspring.test;

import cn.yxffcode.modularspring.core.annotation.ModularReference;
import cn.yxffcode.modularspring.service.TestService;
import cn.yxffcode.modularspring.service.TestStubService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gaohang on 7/7/17.
 */
@Service
public class TestCoreService implements InitializingBean {

  @ModularReference
  private TestService testService;

//  @Autowired
//  private TestStubService testStubService;

  public void init() {
//    testService.test();
//    testStubService.test();
  }

  public TestService getTestService() {
    return testService;
  }

  public void setTestService(TestService testService) {
    this.testService = testService;
  }

  public void afterPropertiesSet() throws Exception {
    init();
  }
}
