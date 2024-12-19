package com.lastant.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lastant.common.annotation.Excel;
import com.lastant.common.core.domain.BaseEntity;

/**
 * 充值订单对象 life_recharge_order
 * 
 * @author ruoyi
 * @date 2024-12-18
 */
public class LifeRechargeOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 充值订单ID */
    private Long id;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderNo;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 充值金额 */
    @Excel(name = "充值金额")
    private BigDecimal amount;

    /** 状态（0: 未支付, 1: 支付成功, 2: 支付失败） */
    @Excel(name = "状态", readConverterExp = "0=:,未=支付,,1=:,支=付成功,,2=:,支=付失败")
    private Long status;

    /** 支付方式（1: 微信支付, 2: 支付宝） */
    @Excel(name = "支付方式", readConverterExp = "1=:,微=信支付,,2=:,支=付宝")
    private Long paymentMethod;

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
    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setPaymentMethod(Long paymentMethod) 
    {
        this.paymentMethod = paymentMethod;
    }

    public Long getPaymentMethod() 
    {
        return paymentMethod;
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
            .append("orderNo", getOrderNo())
            .append("userId", getUserId())
            .append("amount", getAmount())
            .append("status", getStatus())
            .append("paymentMethod", getPaymentMethod())
            .append("extraField1", getExtraField1())
            .append("extraField2", getExtraField2())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
