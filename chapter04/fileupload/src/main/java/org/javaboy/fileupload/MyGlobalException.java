package org.javaboy.fileupload;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@ControllerAdvice//@Controller
//@RestControllerAdvice//@RestController
public class MyGlobalException {
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ModelAndView customException(MaxUploadSizeExceededException e) {
        ModelAndView mv = new ModelAndView("javaboy");
        mv.addObject("error", e.getMessage());
        return mv;
    }
}
