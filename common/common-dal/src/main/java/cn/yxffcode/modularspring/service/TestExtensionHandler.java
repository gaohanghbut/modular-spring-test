package cn.yxffcode.modularspring.service;

import javax.sql.DataSource;

/**
 * @author gaohang
 */
public class TestExtensionHandler {

  public void addDataSource(final DataSource dataSource) {
    System.out.println("add dataSource = " + dataSource);
  }

  public void addExtension(final Object extension) {
    System.out.println("add extension = " + extension);
  }
}
