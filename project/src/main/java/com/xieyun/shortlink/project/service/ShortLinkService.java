package com.xieyun.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xieyun.shortlink.project.dao.entity.ShortLinkDO;
import com.xieyun.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.xieyun.shortlink.project.dto.req.ShortLinkPageReqDTO;
import com.xieyun.shortlink.project.dto.req.ShortLinkUpdateReqDTO;
import com.xieyun.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.xieyun.shortlink.project.dto.resp.ShortLinkGroupCountQueryRespDTO;
import com.xieyun.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author XieYun
 * @version 1.0
 * 短链接接口层
 */
public interface ShortLinkService extends IService<ShortLinkDO> {
    /**
     * 创建短链接
     * @param requestParam 创建短链接请求参数
     * @return 短链接创建信息
     */
    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);

    /**
     * 修改短链接
     * @param requestParam 修改短链接请求参数
     */
    void updateShortLink(ShortLinkUpdateReqDTO requestParam);

    /**
     * 分页查询短链接
     * @param requestParam 分页查询短链接请求参数
     * @return 短链接分页返回结果
     */
    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkPageReqDTO requestParam);

    /**
     * 查询短链接分组内数量
     * @param requestParam 查询短链接分组内数量请求参数
     * @return 查询短链接分组内数量响应
     */
    List<ShortLinkGroupCountQueryRespDTO> listGroupShortLinkCount(List<String> requestParam);

    /**
     * 短链接跳转
     * @param shortUri 短链接后缀
     * @param request HTTP 请求
     * @param response HTTP 响应
     */
    void restoreUrl(@PathVariable("short-uri") String shortUri, ServletRequest request, ServletResponse response);
}
