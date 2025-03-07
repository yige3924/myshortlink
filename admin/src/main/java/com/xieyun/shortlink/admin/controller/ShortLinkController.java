package com.xieyun.shortlink.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xieyun.shortlink.admin.common.convention.result.Result;
import com.xieyun.shortlink.admin.common.convention.result.Results;
import com.xieyun.shortlink.admin.remote.ShortLinkRemoteService;
import com.xieyun.shortlink.admin.remote.dto.req.ShortLinkCreateReqDTO;
import com.xieyun.shortlink.admin.remote.dto.req.ShortLinkPageReqDTO;
import com.xieyun.shortlink.admin.remote.dto.req.ShortLinkUpdateReqDTO;
import com.xieyun.shortlink.admin.remote.dto.resp.ShortLinkCreateRespDTO;
import com.xieyun.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author XieYun
 * @version 1.0
 * 短链接后管控制层
 */
@RestController
public class ShortLinkController {

    /**
     * 后续重构为SpringCloud Feign调用
     */
    ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {};
    /**
     * 创建短链接
     */
    @PostMapping("/api/short-link/admin/v1/create")
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
        return shortLinkRemoteService.createShortLink(requestParam);
    }

    /**
     * 修改短链接
     */
    @PostMapping("/api/short-link/admin/v1/update")
    public Result<Void> updateShortLink(@RequestBody ShortLinkUpdateReqDTO requestParam) {
        ShortLinkRemoteService.updateShortLink(requestParam);
        return Results.success();
    }

    /**
     * 分页查询短链接
     */
    @GetMapping("/api/short-link/admin/v1/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        return shortLinkRemoteService.pageShortLink(requestParam);
    }
}
