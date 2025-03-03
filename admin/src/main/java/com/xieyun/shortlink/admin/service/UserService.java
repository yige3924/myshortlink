package com.xieyun.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xieyun.shortlink.admin.dao.entity.UserDO;
import com.xieyun.shortlink.admin.dto.resp.UserRespDTO;

/**
 * @author XieYun
 * @version 1.0
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);
}
