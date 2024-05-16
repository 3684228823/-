package org.liyu.live.api.controller;

import jakarta.annotation.Resource;
import org.liyu.live.api.service.IHomePageService;
import org.liyu.live.api.vo.HomePageVO;
import org.liyu.live.common.interfaces.vo.WebResponseVO;
import org.liyu.live.web.starter.context.LiyuRequestContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 傅泽杭
 * @Data 2024-03-23 22:34
 * @Description
 */
@RestController
@RequestMapping("/home")
public class HomePageController {

    @Resource
    private IHomePageService homePageService;

    @PostMapping("/initPage")
    public WebResponseVO initPage() {
        Long userId = LiyuRequestContext.getUserId();
        HomePageVO homePageVO = new HomePageVO();
        homePageVO.setLoginStatus(false);
        if (userId != null) {
            homePageVO = homePageService.initPage(userId);
            homePageVO.setLoginStatus(true);
        }
        return WebResponseVO.success(homePageVO);
    }
}
