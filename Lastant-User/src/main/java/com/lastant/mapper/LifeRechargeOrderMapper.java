package com.lastant.mapper;

import java.util.List;
import com.lastant.domain.LifeRechargeOrder;

/**
 * 充值订单Mapper接口
 * 
 * @author ruoyi
 * @date 2024-12-18
 */
public interface LifeRechargeOrderMapper 
{
    /**
     * 查询充值订单
     * 
     * @param id 充值订单主键
     * @return 充值订单
     */
    public LifeRechargeOrder selectLifeRechargeOrderById(Long id);

    /**
     * 查询充值订单列表
     * 
     * @param lifeRechargeOrder 充值订单
     * @return 充值订单集合
     */
    public List<LifeRechargeOrder> selectLifeRechargeOrderList(LifeRechargeOrder lifeRechargeOrder);

    /**
     * 新增充值订单
     * 
     * @param lifeRechargeOrder 充值订单
     * @return 结果
     */
    public int insertLifeRechargeOrder(LifeRechargeOrder lifeRechargeOrder);

    /**
     * 修改充值订单
     * 
     * @param lifeRechargeOrder 充值订单
     * @return 结果
     */
    public int updateLifeRechargeOrder(LifeRechargeOrder lifeRechargeOrder);

    /**
     * 删除充值订单
     * 
     * @param id 充值订单主键
     * @return 结果
     */
    public int deleteLifeRechargeOrderById(Long id);

    /**
     * 批量删除充值订单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLifeRechargeOrderByIds(Long[] ids);
}
