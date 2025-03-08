package com.xieyun.shortlink.project.dto.req;

import lombok.Data;

/**
 * @author XieYun
 * @version 1.0
 * 回收站移除功能
 */
@Data
public class RecycleBinRemoveReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部短链接
     */
    private String fullShortUrl;
}
