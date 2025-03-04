package com.xieyun.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xieyun.shortlink.admin.dao.entity.UserDO;
import com.xieyun.shortlink.admin.dto.req.UserRegisterReqDTO;
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

    /**
     * 查询用户名是否存在
     *
     * @param username 用户名
     * @return 用户名存在返回 true，不存在返回 false
     */
    Boolean hasUsername(String username);

    /**
     * 注册用户
     *
     * @param requestParam 注册用户请求参数
     */
    void register(UserRegisterReqDTO requestParam);
}
