package com.xieyun.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @author XieYun
 * @version 1.0
 * 用户登录请求参数
 */
@Data
public class UserLoginReqDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
