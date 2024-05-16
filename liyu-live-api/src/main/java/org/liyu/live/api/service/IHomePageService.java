package org.liyu.live.api.service;

import org.liyu.live.api.vo.HomePageVO;

/**
 * @Author 傅泽杭
 * @Data 2024-03-23 22:34
 * @Description
 */
public interface IHomePageService {


    /**
     * 初始化页面获取的信息
     *
     * @param userId
     * @return
     */
    HomePageVO initPage(Long userId);


}