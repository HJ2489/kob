package com.kob.backend.consumer.utils;

import com.kob.backend.utils.JwtUtil;
import io.jsonwebtoken.Claims;

/**
 * @author: Torch
 * @Date: 2023/12/21 21:26
 * @Description:
 */
public class JwtAuthentication {
    public static Integer getUserId(String token) {
        Integer userId = -1;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userId = Integer.parseInt(claims.getSubject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return userId;
    }
}
