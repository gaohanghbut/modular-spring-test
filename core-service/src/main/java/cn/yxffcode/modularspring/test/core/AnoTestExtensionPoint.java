package cn.yxffcode.modularspring.test.core;

import cn.yxffcode.modularspring.core.ext.annotation.ExtensionPoint;
import org.springframework.stereotype.Component;

/**
 * @author gaohang
 */
@ExtensionPoint("testAnnotationExtensionHandler")
@Component
public class AnoTestExtensionPoint {
}
