package com.xieyun.shortlink.admin.remote;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xieyun.shortlink.admin.common.convention.result.Result;
import com.xieyun.shortlink.admin.dto.req.RecycleBinRecoverReqDTO;
import com.xieyun.shortlink.admin.dto.req.RecycleBinRemoveReqDTO;
import com.xieyun.shortlink.admin.dto.req.RecycleBinSaveReqDTO;
import com.xieyun.shortlink.admin.remote.dto.req.ShortLinkCreateReqDTO;
import com.xieyun.shortlink.admin.remote.dto.req.ShortLinkPageReqDTO;
import com.xieyun.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.xieyun.shortlink.admin.remote.dto.req.ShortLinkUpdateReqDTO;
import com.xieyun.shortlink.admin.remote.dto.resp.ShortLinkCreateRespDTO;
import com.xieyun.shortlink.admin.remote.dto.resp.ShortLinkGroupCountQueryRespDTO;
import com.xieyun.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XieYun
 * @version 1.0
 * 短链接中台远程调用服务
 */
public interface ShortLinkRemoteService {

    /**
     * 修改短链接
     *
     * @param requestParam 修改短链接请求参数
     */
    static void updateShortLink(ShortLinkUpdateReqDTO requestParam) {
        HttpUtil.post("http://127.0.0.1:8001/api/short-link/v1/update",
                JSON.toJSONString(requestParam));
    }

    /**
     * 创建短链接
     *
     * @param requestParam 创建短链接请求参数
     * @return 短链接创建响应
     */
    default Result<ShortLinkCreateRespDTO> createShortLink(ShortLinkCreateReqDTO requestParam) {
        String resultBodyStr = HttpUtil.post("http://127.0.0.1:8001/api/short-link/v1/create",
                JSON.toJSONString(requestParam));
        return JSON.parseObject(resultBodyStr, new TypeReference<>() {});
    }

    /**
     * 分页查询短链接
     *
     * @param requestParam 分页短链接请求参数
     * @return 查询短链接响应
     */
    default Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("gid", requestParam.getGid());
        requestMap.put("current", requestParam.getCurrent());
        requestMap.put("size", requestParam.getSize());
        String resultPageStr = HttpUtil.get("http://127.0.0.1:8001/api/short-link/v1/page", requestMap);
        return JSON.parseObject(resultPageStr, new TypeReference<>() {});
    }

    /**
     * 查询分组短链接总量
     *
     * @param requestParam 分组短链接总量请求参数
     * @return 查询分组短链接总量响应
     */
    default Result<List<ShortLinkGroupCountQueryRespDTO>> listGroupShortLinkCount(List<String> requestParam) {
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("requestParam", requestParam);
        String resultPageStr = HttpUtil.get("http://127.0.0.1:8001/api/short-link/v1/count", requestMap);
        return JSON.parseObject(resultPageStr, new TypeReference<>() {});
    }

    /**
     * 根据 URL 获取标题
     * @param url 目标网站地址
     * @return 网站标题
     */
    default Result<String> getTitleByUrl(@RequestParam("url") String url) {
        String resultStr = HttpUtil.get("http://127.0.0.1:8001/api/short-link/v1/title?url=" + url);
        return JSON.parseObject(resultStr, new TypeReference<>() {});
    }

    /**
     * 保存回收站
     *
     * @param requestParam 请求参数
     */
    default void saveRecycleBin(RecycleBinSaveReqDTO requestParam) {
        HttpUtil.post("http://127.0.0.1:8001/api/short-link/v1/recycle-bin/save",
                JSON.toJSONString(requestParam));
    }

    /**
     * 分页查询回收站短链接
     *
     * @param requestParam 分页短链接请求参数
     * @return 查询短链接响应
     */
    default Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("gidList", requestParam.getGidList());
        requestMap.put("current", requestParam.getCurrent());
        requestMap.put("size", requestParam.getSize());
        String resultPageStr = HttpUtil.get("http://127.0.0.1:8001/api/short-link/v1/recycle-bin/page", requestMap);
        return JSON.parseObject(resultPageStr, new TypeReference<>() {});
    }

    /**
     * 从回收站恢复短链接
     * @param requestParam 恢复短链接请求参数
     */
    default void recoverRecycleBin(RecycleBinRecoverReqDTO requestParam) {
        HttpUtil.post("http://127.0.0.1:8001/api/short-link/v1/recycle-bin/recover",
                JSON.toJSONString(requestParam));
    }

    /**
     * 从回收站移除短链接
     * @param requestParam 移除短链接请求参数
     */
    default void recoverRemoveBin(RecycleBinRemoveReqDTO requestParam) {
        HttpUtil.post("http://127.0.0.1:8001/api/short-link/v1/recycle-bin/remove",
                JSON.toJSONString(requestParam));
    }
}
