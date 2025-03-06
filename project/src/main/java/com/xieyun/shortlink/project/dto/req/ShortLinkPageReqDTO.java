package com.xieyun.shortlink.project.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xieyun.shortlink.project.dao.entity.ShortLinkDO;
import lombok.Data;

/**
 * @author XieYun
 * @version 1.0
 * 短链接分页请求参数
 */
@Data
public class ShortLinkPageReqDTO extends Page<ShortLinkDO> {

    /**
     * 分组标识
     */
    private String gid;
}
