package org.javaboy.controlleradvice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public void hello(Model model) {
        Map<String, Object> asMap = model.asMap();
        Map<String, String> info = (Map<String, String>) asMap.get("info");
        Set<String> keySet = info.keySet();
        for (String s : keySet) {
            System.out.println(s + "----" + info.get(s));
        }

    }
}
