package com.xieyun.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xieyun.shortlink.project.dao.entity.ShortLinkDO;
import com.xieyun.shortlink.project.dto.req.RecycleBinRecoverReqDTO;
import com.xieyun.shortlink.project.dto.req.RecycleBinRemoveReqDTO;
import com.xieyun.shortlink.project.dto.req.RecycleBinSaveReqDTO;
import com.xieyun.shortlink.project.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.xieyun.shortlink.project.dto.resp.ShortLinkPageRespDTO;

/**
 * @author XieYun
 * @version 1.0
 * 回收站管理接口层
 */
public interface RecycleBinService extends IService<ShortLinkDO> {

    /**
     * 保存回收站
     *
     * @param requestParam 请求参数
     */
    void saveRecycleBin(RecycleBinSaveReqDTO requestParam);

    /**
     * 分页查询短链接
     * @param requestParam 分页查询短链接请求参数
     * @return 短链接分页返回结果
     */
    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkRecycleBinPageReqDTO requestParam);

    /**
     * 从回收站恢复短链接
     * @param requestParam 恢复短链接请求参数
     */
    void recoverRecycleBin(RecycleBinRecoverReqDTO requestParam);

    /**
     * 从回收站移除短链接
     * @param requestParam 移除短链接请求参数
     */
    void recoverRemoveBin(RecycleBinRemoveReqDTO requestParam);
}
