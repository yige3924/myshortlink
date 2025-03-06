package com.xieyun.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @author XieYun
 * @version 1.0
 * 短链接分组排序参数
 */
@Data
public class ShortLinkGroupSortReqDTO {

    /**
     * 分组ID
     */
    private String gid;

    /**
     * 排序
     */
    private Integer sortOrder;
}
