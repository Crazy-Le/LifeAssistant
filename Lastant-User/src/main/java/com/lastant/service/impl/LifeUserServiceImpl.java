package com.lastant.service.impl;

import java.util.List;
import com.lastant.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lastant.mapper.LifeUserMapper;
import com.lastant.domain.LifeUser;
import com.lastant.service.ILifeUserService;

/**
 * 我的用户Service业务层处理
 * 
 * @author CrazyLe
 * @date 2024-12-18
 */
@Service
public class LifeUserServiceImpl implements ILifeUserService 
{
    @Autowired
    private LifeUserMapper lifeUserMapper;

    /**
     * 查询我的用户
     * 
     * @param id 我的用户主键
     * @return 我的用户
     */
    @Override
    public LifeUser selectLifeUserById(Long id)
    {
        return lifeUserMapper.selectLifeUserById(id);
    }

    /**
     * 查询我的用户列表
     * 
     * @param lifeUser 我的用户
     * @return 我的用户
     */
    @Override
    public List<LifeUser> selectLifeUserList(LifeUser lifeUser)
    {
        return lifeUserMapper.selectLifeUserList(lifeUser);
    }

    /**
     * 新增我的用户
     * 
     * @param lifeUser 我的用户
     * @return 结果
     */
    @Override
    public int insertLifeUser(LifeUser lifeUser)
    {
        lifeUser.setCreateTime(DateUtils.getNowDate());
        return lifeUserMapper.insertLifeUser(lifeUser);
    }

    /**
     * 修改我的用户
     * 
     * @param lifeUser 我的用户
     * @return 结果
     */
    @Override
    public int updateLifeUser(LifeUser lifeUser)
    {
        lifeUser.setUpdateTime(DateUtils.getNowDate());
        return lifeUserMapper.updateLifeUser(lifeUser);
    }

    /**
     * 批量删除我的用户
     * 
     * @param ids 需要删除的我的用户主键
     * @return 结果
     */
    @Override
    public int deleteLifeUserByIds(Long[] ids)
    {
        return lifeUserMapper.deleteLifeUserByIds(ids);
    }

    /**
     * 删除我的用户信息
     * 
     * @param id 我的用户主键
     * @return 结果
     */
    @Override
    public int deleteLifeUserById(Long id)
    {
        return lifeUserMapper.deleteLifeUserById(id);
    }
}
