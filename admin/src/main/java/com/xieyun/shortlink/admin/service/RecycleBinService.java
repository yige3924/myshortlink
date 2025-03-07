package com.xieyun.shortlink.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xieyun.shortlink.admin.common.convention.result.Result;
import com.xieyun.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.xieyun.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;

/**
 * @author XieYun
 * @version 1.0
 * 回收站管理接口层
 */
public interface RecycleBinService {

    /**
     * 分页查询回收站短链接
     * @param requestParam 请求参数
     * @return 返回参数包装
     */
    Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam);
}
