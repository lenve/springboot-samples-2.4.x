package org.javaboy.swagger3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Configuration
public class SwaggerConfig {
    @Bean
    Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.javaboy.swagger3.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(
                        new ApiInfoBuilder()
                                .description("vhr 项目接口文档")
                                .contact(new Contact("javaboy","http://www.itboyhub.com","111@qq.com"))
                                .version("v1.0")
                                .title("API 测试文档")
                                .license("Apache2.0")
                                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                        .build()
                );
    }
}
