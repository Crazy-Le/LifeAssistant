package com.lastant.service.impl;

import java.util.List;
import com.lastant.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lastant.mapper.LifeRechargeOrderMapper;
import com.lastant.domain.LifeRechargeOrder;
import com.lastant.service.ILifeRechargeOrderService;

/**
 * 充值订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-18
 */
@Service
public class LifeRechargeOrderServiceImpl implements ILifeRechargeOrderService 
{
    @Autowired
    private LifeRechargeOrderMapper lifeRechargeOrderMapper;

    /**
     * 查询充值订单
     * 
     * @param id 充值订单主键
     * @return 充值订单
     */
    @Override
    public LifeRechargeOrder selectLifeRechargeOrderById(Long id)
    {
        return lifeRechargeOrderMapper.selectLifeRechargeOrderById(id);
    }

    /**
     * 查询充值订单列表
     * 
     * @param lifeRechargeOrder 充值订单
     * @return 充值订单
     */
    @Override
    public List<LifeRechargeOrder> selectLifeRechargeOrderList(LifeRechargeOrder lifeRechargeOrder)
    {
        return lifeRechargeOrderMapper.selectLifeRechargeOrderList(lifeRechargeOrder);
    }

    /**
     * 新增充值订单
     * 
     * @param lifeRechargeOrder 充值订单
     * @return 结果
     */
    @Override
    public int insertLifeRechargeOrder(LifeRechargeOrder lifeRechargeOrder)
    {
        lifeRechargeOrder.setCreateTime(DateUtils.getNowDate());
        return lifeRechargeOrderMapper.insertLifeRechargeOrder(lifeRechargeOrder);
    }

    /**
     * 修改充值订单
     * 
     * @param lifeRechargeOrder 充值订单
     * @return 结果
     */
    @Override
    public int updateLifeRechargeOrder(LifeRechargeOrder lifeRechargeOrder)
    {
        lifeRechargeOrder.setUpdateTime(DateUtils.getNowDate());
        return lifeRechargeOrderMapper.updateLifeRechargeOrder(lifeRechargeOrder);
    }

    /**
     * 批量删除充值订单
     * 
     * @param ids 需要删除的充值订单主键
     * @return 结果
     */
    @Override
    public int deleteLifeRechargeOrderByIds(Long[] ids)
    {
        return lifeRechargeOrderMapper.deleteLifeRechargeOrderByIds(ids);
    }

    /**
     * 删除充值订单信息
     * 
     * @param id 充值订单主键
     * @return 结果
     */
    @Override
    public int deleteLifeRechargeOrderById(Long id)
    {
        return lifeRechargeOrderMapper.deleteLifeRechargeOrderById(id);
    }
}
