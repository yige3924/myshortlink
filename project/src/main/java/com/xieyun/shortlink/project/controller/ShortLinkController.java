package com.xieyun.shortlink.project.controller;

import com.xieyun.shortlink.project.common.convention.result.Result;
import com.xieyun.shortlink.project.common.convention.result.Results;
import com.xieyun.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.xieyun.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.xieyun.shortlink.project.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XieYun
 * @version 1.0
 * 短链接控制层
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    @PostMapping("/api/short-link/v1/create")
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
        return Results.success(shortLinkService.createShortLink(requestParam));
    }
}
