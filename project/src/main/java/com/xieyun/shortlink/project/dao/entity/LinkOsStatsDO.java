package com.xieyun.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xieyun.shortlink.project.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author XieYun
 * @version 1.0
 * 操作系统统计访问实体
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_link_os_stats")
public class LinkOsStatsDO extends BaseDO {

    /**
     * id
     */
    private Integer id;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 日期
     */
    private Date date;

    /**
     * 访问量
     */
    private Integer cnt;

    /**
     * 操作系统
     */
    private String os;
}
