package org.liyu.live.api.controller;

import jakarta.annotation.Resource;
import org.liyu.live.api.service.ImService;
import org.liyu.live.common.interfaces.vo.WebResponseVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 傅泽杭
 * @Data 2024-04-07 20:59
 * @Description
 */
@RestController
@RequestMapping("/im")
public class ImController {

    @Resource
    private ImService imService;

    @PostMapping("/getImConfig")
    public WebResponseVO getImConfig() {
        return WebResponseVO.success(imService.getImConfig());
    }
}

