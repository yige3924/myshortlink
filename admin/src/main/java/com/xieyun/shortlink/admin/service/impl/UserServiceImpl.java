package com.xieyun.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xieyun.shortlink.admin.common.convention.exception.ClientException;
import com.xieyun.shortlink.admin.common.enums.UserErrorCodeEnum;
import com.xieyun.shortlink.admin.dao.entity.UserDO;
import com.xieyun.shortlink.admin.dao.mapper.UserMapper;
import com.xieyun.shortlink.admin.dto.resp.UserRespDTO;
import com.xieyun.shortlink.admin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author XieYun
 * @version 1.0
 * 用户接口实现层
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
    @Override
    public UserRespDTO getUserByUsername(String username) {
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                                                          .eq(UserDO::getUsername, username);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        if (userDO == null) {
            throw new ClientException(UserErrorCodeEnum.USER_NULL);
        }
        UserRespDTO result = new UserRespDTO();
        BeanUtils.copyProperties(userDO, result); // 该方法需要判空，否则会报错
        return result;
    }
}
