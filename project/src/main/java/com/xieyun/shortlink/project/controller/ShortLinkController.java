package com.xieyun.shortlink.project.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xieyun.shortlink.project.common.convention.result.Result;
import com.xieyun.shortlink.project.common.convention.result.Results;
import com.xieyun.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.xieyun.shortlink.project.dto.req.ShortLinkPageReqDTO;
import com.xieyun.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.xieyun.shortlink.project.dto.resp.ShortLinkGroupCountQueryRespDTO;
import com.xieyun.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import com.xieyun.shortlink.project.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author XieYun
 * @version 1.0
 * 短链接控制层
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    /**
     * 创建短链接
     */
    @PostMapping("/api/short-link/v1/create")
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
        return Results.success(shortLinkService.createShortLink(requestParam));
    }

    /**
     * 分页查询短链接
     */
    @GetMapping("/api/short-link/v1/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        return Results.success(shortLinkService.pageShortLink(requestParam));
    }

    /**
     * 查询短链接分组内数量
     */
    @GetMapping("/api/short-link/v1/count")
    public Result<List<ShortLinkGroupCountQueryRespDTO>> listGroupShortLinkCount(@RequestParam("requestParam") List<String> requestParam) {
        return Results.success(shortLinkService.listGroupShortLinkCount(requestParam));
    }
}
