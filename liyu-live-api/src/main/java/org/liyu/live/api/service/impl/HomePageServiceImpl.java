package org.liyu.live.api.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.liyu.live.api.service.IHomePageService;
import org.liyu.live.api.vo.HomePageVO;
import org.liyu.live.user.constants.UserTagsEnum;
import org.liyu.live.user.dto.UserDTO;
import org.liyu.live.user.interfaces.IUserRpc;
import org.liyu.live.user.interfaces.IUserTagRpc;
import org.springframework.stereotype.Service;

/**
 * @Author 傅泽杭
 * @Data 2024-03-23 22:34
 * @Description
 */
@Service
public class HomePageServiceImpl implements IHomePageService {

    @DubboReference
    private IUserRpc userRpc;
    @DubboReference
    private IUserTagRpc userTagRpc;

    @Override
    public HomePageVO initPage(Long userId) {
        UserDTO userDTO = userRpc.getByUserId(userId);
        HomePageVO homePageVO = new HomePageVO();
        if (userDTO != null) {
            homePageVO.setAvatar(userDTO.getAvatar());
            homePageVO.setUserId(userId);
            homePageVO.setNickName(userDTO.getNickName());
            //vip用户有权利开播
            homePageVO.setShowStartLivingBtn(userTagRpc.containTag(userId, UserTagsEnum.IS_VIP));
        }
        return homePageVO;
    }
}
