package com.xieyun.shortlink.admin.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XieYun
 * @version 1.0
 * 用户登录接口返回响应
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginRespDTO {

    /**
     * 用户Token
     */
    private String token;
}
