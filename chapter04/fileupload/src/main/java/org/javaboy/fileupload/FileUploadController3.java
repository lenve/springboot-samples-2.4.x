package org.javaboy.fileupload;

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
public class FileUploadController3 {
    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");

    @PostMapping("/upload3")
    public void upload(MultipartFile file1, MultipartFile file2, HttpServletRequest req) {
        String realPath = req.getServletContext().getRealPath("/");
        String format = sdf.format(new Date());
        String path = realPath + format;
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        try {
            String oldName1 = file1.getOriginalFilename();
            String newName1 = UUID.randomUUID().toString() + oldName1.substring(oldName1.lastIndexOf("."));
            file1.transferTo(new File(folder, newName1));
            String s1 = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + format + newName1;
            System.out.println("s1 = " + s1);

            String oldName2 = file2.getOriginalFilename();
            String newName2 = UUID.randomUUID().toString() + oldName2.substring(oldName2.lastIndexOf("."));
            file2.transferTo(new File(folder, newName2));
            String s2 = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + format + newName2;
            System.out.println("s2 = " + s2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}