package cn.yxffcode.modularspring.service;

import cn.yxffcode.modularspring.core.ext.annotation.ExtensionHandler;
import cn.yxffcode.modularspring.core.ext.annotation.ExtensionListener;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author gaohang
 */
@ExtensionHandler("testAnnotationExtensionHandler")
@Component
public class TestAnnotationExtensionHandler {

  @ExtensionListener
  public void addDataSource(final DataSource dataSource) {
    System.out.println("testAnnotationExtensionHandler add dataSource = " + dataSource);
  }

  @ExtensionListener(Object.class)
  public void addExtension(final Object extension) {
    System.out.println("testAnnotationExtensionHandler add extension = " + extension);
  }
}
