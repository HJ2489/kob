package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author: Torch
 * @Date: 2023/12/07 17:27
 * @Description:
 */
public interface RegisterService {
    Map<String, String> register(String username, String password, String confirmedPassword);
}
