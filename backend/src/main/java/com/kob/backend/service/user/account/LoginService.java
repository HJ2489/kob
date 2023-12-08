package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author: Torch
 * @Date: 2023/12/07 17:26
 * @Description:
 */
public interface LoginService {
    Map<String, String> getToken(String username, String password);
}
