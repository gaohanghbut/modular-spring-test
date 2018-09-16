package cn.yxffcode.modularspring.service;

import cn.yxffcode.modularspring.boot.ModuleConfig;
import cn.yxffcode.modularspring.boot.listener.ModuleLoadListener;
import cn.yxffcode.modularspring.core.context.ModuleApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @author gaohang on 7/9/17.
 */
public class PostFactoryBeanModuleLoadListener implements ModuleLoadListener {

  public void beforeModuleLoad(ModuleConfig moduleConfig, ModuleApplicationContext applicationContext) {
    applicationContext.addBeanFactoryPostProcessor(new BeanDefinitionRegistryPostProcessor() {
      public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        //do something
      }

      public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //do something
      }
    });
  }

  public void afterModuleLoad(ModuleConfig moduleConfig, ModuleApplicationContext applicationContext) {

  }
}
