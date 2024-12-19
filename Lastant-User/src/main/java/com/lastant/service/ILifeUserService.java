package com.lastant.service;

import java.util.List;
import com.lastant.domain.LifeUser;

/**
 * 我的用户Service接口
 * 
 * @author CrazyLe
 * @date 2024-12-18
 */
public interface ILifeUserService 
{
    /**
     * 查询我的用户
     * 
     * @param id 我的用户主键
     * @return 我的用户
     */
    public LifeUser selectLifeUserById(Long id);

    /**
     * 查询我的用户列表
     * 
     * @param lifeUser 我的用户
     * @return 我的用户集合
     */
    public List<LifeUser> selectLifeUserList(LifeUser lifeUser);

    /**
     * 新增我的用户
     * 
     * @param lifeUser 我的用户
     * @return 结果
     */
    public int insertLifeUser(LifeUser lifeUser);

    /**
     * 修改我的用户
     * 
     * @param lifeUser 我的用户
     * @return 结果
     */
    public int updateLifeUser(LifeUser lifeUser);

    /**
     * 批量删除我的用户
     * 
     * @param ids 需要删除的我的用户主键集合
     * @return 结果
     */
    public int deleteLifeUserByIds(Long[] ids);

    /**
     * 删除我的用户信息
     * 
     * @param id 我的用户主键
     * @return 结果
     */
    public int deleteLifeUserById(Long id);
}
