package com.lastant.mapper;

import com.lastant.domain.LifeUser;

/**
 * @ClassName CrazyLe
 * @Description TODO
 * @date 2024/12/19 10:40
 * @Version 1.0
 */
public interface LifeUserLoginMapper {
    LifeUser selectWxUserByOpenId(String openId);
    Integer insertLifeUser(LifeUser user);
    Integer updateLifeUser(Long id);

}
