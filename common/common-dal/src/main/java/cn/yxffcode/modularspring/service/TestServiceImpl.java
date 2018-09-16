package cn.yxffcode.modularspring.service;

import cn.yxffcode.modularspring.core.annotation.ModularService;
import cn.yxffcode.modularspring.core.ext.ExtensionContainer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author gaohang on 7/2/17.
 */
@ModularService
public class TestServiceImpl implements TestService {

  @Autowired
  private ExtensionContainer<Object> testExtensionContainer;

  public String test() {
    return String.valueOf(testExtensionContainer.getExtensions());
  }
}
