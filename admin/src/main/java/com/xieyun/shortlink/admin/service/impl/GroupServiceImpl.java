package com.xieyun.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xieyun.shortlink.admin.dao.entity.GroupDO;
import com.xieyun.shortlink.admin.dao.mapper.GroupMapper;
import com.xieyun.shortlink.admin.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author XieYun
 * @version 1.0
 * 短链接分组接口实现层
 */
@Slf4j
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {
}
