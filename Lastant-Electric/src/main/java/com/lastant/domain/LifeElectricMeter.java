package com.lastant.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lastant.common.annotation.Excel;
import com.lastant.common.core.domain.BaseEntity;

/**
 * 全部电表对象 life_electric_meter
 * 
 * @author CrazyLe
 * @date 2024-12-18
 */
public class LifeElectricMeter extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 电表ID */
    private Long id;

    /** 电表编号 */
    @Excel(name = "电表编号")
    private String meterNo;

    /** 安装地址 */
    @Excel(name = "安装地址")
    private String location;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 状态（1: 正常，0: 异常） */
    @Excel(name = "状态", readConverterExp = "1=:,正=常，0:,异=常")
    private Long status;

    /** 预留字段1 */
    @Excel(name = "预留字段1")
    private String extraField1;

    /** 预留字段2 */
    @Excel(name = "预留字段2")
    private String extraField2;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMeterNo(String meterNo) 
    {
        this.meterNo = meterNo;
    }

    public String getMeterNo() 
    {
        return meterNo;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setExtraField1(String extraField1) 
    {
        this.extraField1 = extraField1;
    }

    public String getExtraField1() 
    {
        return extraField1;
    }
    public void setExtraField2(String extraField2) 
    {
        this.extraField2 = extraField2;
    }

    public String getExtraField2() 
    {
        return extraField2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("meterNo", getMeterNo())
            .append("location", getLocation())
            .append("userId", getUserId())
            .append("status", getStatus())
            .append("extraField1", getExtraField1())
            .append("extraField2", getExtraField2())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
