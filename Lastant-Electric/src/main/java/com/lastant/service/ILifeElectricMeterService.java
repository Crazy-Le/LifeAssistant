package com.lastant.service;

import java.util.List;
import com.lastant.domain.LifeElectricMeter;

/**
 * 全部电表Service接口
 * 
 * @author CrazyLe
 * @date 2024-12-18
 */
public interface ILifeElectricMeterService 
{
    /**
     * 查询全部电表
     * 
     * @param id 全部电表主键
     * @return 全部电表
     */
    public LifeElectricMeter selectLifeElectricMeterById(Long id);

    /**
     * 查询全部电表列表
     * 
     * @param lifeElectricMeter 全部电表
     * @return 全部电表集合
     */
    public List<LifeElectricMeter> selectLifeElectricMeterList(LifeElectricMeter lifeElectricMeter);

    /**
     * 新增全部电表
     * 
     * @param lifeElectricMeter 全部电表
     * @return 结果
     */
    public int insertLifeElectricMeter(LifeElectricMeter lifeElectricMeter);

    /**
     * 修改全部电表
     * 
     * @param lifeElectricMeter 全部电表
     * @return 结果
     */
    public int updateLifeElectricMeter(LifeElectricMeter lifeElectricMeter);

    /**
     * 批量删除全部电表
     * 
     * @param ids 需要删除的全部电表主键集合
     * @return 结果
     */
    public int deleteLifeElectricMeterByIds(Long[] ids);

    /**
     * 删除全部电表信息
     * 
     * @param id 全部电表主键
     * @return 结果
     */
    public int deleteLifeElectricMeterById(Long id);
}
