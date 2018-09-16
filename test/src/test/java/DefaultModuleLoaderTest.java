import cn.yxffcode.modularspring.core.io.ClasspathScanner;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSortedSet;
import org.junit.Test;

/**
 * @author gaohang on 6/30/17.
 */
public class DefaultModuleLoaderTest {
  @Test
  public void testClasspath() throws Exception {
    final ClasspathScanner scanner = new ClasspathScanner();
    scanner.scan(DefaultModuleLoaderTest.class.getClassLoader(), new Predicate<String>() {
      public boolean apply(String input) {
        return input.contains("module.json") || input.contains("META-INF/spring/");
      }

    });

    final ImmutableSortedSet<ClasspathScanner.ResourceInfo> resources = scanner.getResources();
    for (ClasspathScanner.ResourceInfo resource : resources) {
      System.out.println(resource.getResourceName());
    }
  }

}