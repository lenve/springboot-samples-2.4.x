package org.javaboy.idempontent.token;

import org.javaboy.idempontent.exception.IdempotentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
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
@Service
public class TokenService {
    @Autowired
    RedisService redisService;

    public String createToken() {
        String uuid = UUID.randomUUID().toString();
        redisService.setEx(uuid, uuid, 10000L);
        return uuid;
    }

    public boolean checkToken(HttpServletRequest request) throws IdempotentException {
        String token = request.getHeader("token");
        if (StringUtils.isEmpty(token)) {
            token = request.getParameter("token");
            if (StringUtils.isEmpty(token)) {
                throw new IdempotentException("token 不存在");
            }
        }
        if (!redisService.exists(token)) {
            throw new IdempotentException("重复操作！");
        }
        boolean remove = redisService.remove(token);
        if (!remove) {
            throw new IdempotentException("重复操作！");
        }
        return true;
    }
}
