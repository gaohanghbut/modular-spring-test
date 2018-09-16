package cn.yxffcode.test.web.home;

import cn.yxffcode.modularspring.core.annotation.ModularReference;
import cn.yxffcode.modularspring.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author gaohang on 7/15/17.
 */
@RequestMapping("/")
@Controller
public class HomeController {

  @ModularReference
  private TestService testService;

  @RequestMapping(value = "index")
  @ResponseBody
  public JsonResult<TestBean> index() {

    final TestBean testBean = new TestBean();
    testBean.setName(testService.test());

    return JsonResult.success(testBean);
  }

}
