package com.lastant.service.impl;

import java.util.List;
import com.lastant.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lastant.mapper.LifeElectricMeterMapper;
import com.lastant.domain.LifeElectricMeter;
import com.lastant.service.ILifeElectricMeterService;

/**
 * 全部电表Service业务层处理
 * 
 * @author CrazyLe
 * @date 2024-12-18
 */
@Service
public class LifeElectricMeterServiceImpl implements ILifeElectricMeterService 
{
    @Autowired
    private LifeElectricMeterMapper lifeElectricMeterMapper;

    /**
     * 查询全部电表
     * 
     * @param id 全部电表主键
     * @return 全部电表
     */
    @Override
    public LifeElectricMeter selectLifeElectricMeterById(Long id)
    {
        return lifeElectricMeterMapper.selectLifeElectricMeterById(id);
    }

    /**
     * 查询全部电表列表
     * 
     * @param lifeElectricMeter 全部电表
     * @return 全部电表
     */
    @Override
    public List<LifeElectricMeter> selectLifeElectricMeterList(LifeElectricMeter lifeElectricMeter)
    {
        return lifeElectricMeterMapper.selectLifeElectricMeterList(lifeElectricMeter);
    }

    /**
     * 新增全部电表
     * 
     * @param lifeElectricMeter 全部电表
     * @return 结果
     */
    @Override
    public int insertLifeElectricMeter(LifeElectricMeter lifeElectricMeter)
    {
        lifeElectricMeter.setCreateTime(DateUtils.getNowDate());
        return lifeElectricMeterMapper.insertLifeElectricMeter(lifeElectricMeter);
    }

    /**
     * 修改全部电表
     * 
     * @param lifeElectricMeter 全部电表
     * @return 结果
     */
    @Override
    public int updateLifeElectricMeter(LifeElectricMeter lifeElectricMeter)
    {
        lifeElectricMeter.setUpdateTime(DateUtils.getNowDate());
        return lifeElectricMeterMapper.updateLifeElectricMeter(lifeElectricMeter);
    }

    /**
     * 批量删除全部电表
     * 
     * @param ids 需要删除的全部电表主键
     * @return 结果
     */
    @Override
    public int deleteLifeElectricMeterByIds(Long[] ids)
    {
        return lifeElectricMeterMapper.deleteLifeElectricMeterByIds(ids);
    }

    /**
     * 删除全部电表信息
     * 
     * @param id 全部电表主键
     * @return 结果
     */
    @Override
    public int deleteLifeElectricMeterById(Long id)
    {
        return lifeElectricMeterMapper.deleteLifeElectricMeterById(id);
    }
}
