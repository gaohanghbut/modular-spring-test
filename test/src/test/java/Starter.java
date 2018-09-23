import cn.yxffcode.modularspring.boot.ApplicationManager;
import cn.yxffcode.modularspring.boot.DefaultModuleLoaderFactory;
import cn.yxffcode.modularspring.boot.ModuleConfig;
import cn.yxffcode.modularspring.core.ModularSpringConfiguration;
import cn.yxffcode.modularspring.core.context.ModuleApplicationContext;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author gaohang on 6/27/17.
 */
public class Starter {
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    final ModularSpringConfiguration modularSpringConfiguration = new ModularSpringConfiguration();
    modularSpringConfiguration.setPluginPath("/tmp/plugins/");
    final ApplicationManager applicationManager = new ApplicationManager(modularSpringConfiguration, new DefaultModuleLoaderFactory());
    applicationManager.boot();

//    final Field field = applicationManager.getClass().getDeclaredField("applicationContexts");
//    field.setAccessible(true);
//    final Map<ModuleConfig, ModuleApplicationContext> applicationContexts = (Map<ModuleConfig, ModuleApplicationContext>) field.get(applicationManager);
//
//    for (Map.Entry<ModuleConfig, ModuleApplicationContext> en : applicationContexts.entrySet()) {
//      if (!"cn.yxffcode.test.commonsal".equals(en.getKey().getModuleName())) {
//        continue;
//      }
//      final ModuleApplicationContext ctx = en.getValue();
//      final TestService testPluginService = (TestService) ctx.getBean("testPluginService");
//      testPluginService.f();
//    }

    applicationManager.destroy();
  }
}
