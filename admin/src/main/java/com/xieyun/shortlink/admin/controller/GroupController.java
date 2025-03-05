package com.xieyun.shortlink.admin.controller;

import com.xieyun.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XieYun
 * @version 1.0
 * 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;
}
