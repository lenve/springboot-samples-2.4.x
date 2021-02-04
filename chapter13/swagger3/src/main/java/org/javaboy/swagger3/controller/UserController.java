package org.javaboy.swagger3.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.javaboy.swagger3.model.User;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

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
public class UserController {
    @GetMapping("/hello")
    @ApiIgnore
    public String hello() {
        return "hello";
    }

    //    @ApiOperation(value = "查询用户",notes = "根据 id 查询用户")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "请求成功"),
            @ApiResponse(responseCode = "500", description = "请求失败")
    })
    @Operation(summary = "查询用户", description = "根据 id 查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "id", value = "用户 id", required = true)
    })
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable Integer id) {
        return "user:" + id;
    }

    @PostMapping("/user")
    @Parameter(name = "user")
    public String addUser(@RequestBody User user) {
        return user.toString();
    }
}
