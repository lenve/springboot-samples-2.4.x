package org.javaboy.demo04.anno;

import org.javaboy.demo04.model.Apple;
import org.javaboy.demo04.model.Banana;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//1.@Import({Apple.class, Banana.class})
//2.可以直接导入配置类
//3.@Import({FruitImportSelector.class})
@Import({FruitImportDefinitionRegistar.class})
public @interface EnableFruit {
}
