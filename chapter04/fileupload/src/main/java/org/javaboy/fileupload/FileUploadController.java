package org.javaboy.fileupload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

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
public class FileUploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest req) {
        String realPath = req.getServletContext().getRealPath("/");
        String format = sdf.format(new Date());
        String path = realPath + format;
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        try {
            file.transferTo(new File(folder, newName));
            String s = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + format + newName;
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @GetMapping("/hello")
    public void hello() {
        int i = 1 / 0;
    }
}