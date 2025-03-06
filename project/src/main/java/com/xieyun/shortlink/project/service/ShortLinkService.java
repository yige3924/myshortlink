package com.xieyun.shortlink.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xieyun.shortlink.project.dao.entity.ShortLinkDO;
import com.xieyun.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.xieyun.shortlink.project.dto.resp.ShortLinkCreateRespDTO;

/**
 * @author XieYun
 * @version 1.0
 * 短链接接口层
 */
public interface ShortLinkService extends IService<ShortLinkDO> {
    /**
     * 创建短链接
     * @param requestParam 创建短链接请求参数
     * @return 短链接创建参数
     */
    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);
}
