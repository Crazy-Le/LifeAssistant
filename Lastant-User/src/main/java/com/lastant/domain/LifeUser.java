package com.lastant.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lastant.common.annotation.Excel;
import com.lastant.common.core.domain.BaseEntity;

/**
 * 我的用户对象 life_user
 * 
 * @author CrazyLe
 * @date 2024-12-18
 */
public class LifeUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 密码（加密存储） */
    @Excel(name = "密码", readConverterExp = "加=密存储")
    private String password;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 微信OpenID */
    @Excel(name = "微信OpenID")
    private String openId;

    /** 微信UnionID */
    @Excel(name = "微信UnionID")
    private String unionId;

    /** 用户头像 */
    @Excel(name = "用户头像")
    private String avatar;

    /** 微信昵称 */
    @Excel(name = "微信昵称")
    private String nickname;

    /** 上级用户ID（分销） */
    @Excel(name = "上级用户ID", readConverterExp = "分=销")
    private Long parentId;

    /** 累计佣金金额 */
    @Excel(name = "累计佣金金额")
    private BigDecimal totalCommission;

    /** 可提现佣金金额 */
    @Excel(name = "可提现佣金金额")
    private BigDecimal withdrawableCommission;

    /** 账户余额 */
    @Excel(name = "账户余额")
    private BigDecimal balance;

    /** 状态 */
    @Excel(name = "状态")
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
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setOpenId(String openId) 
    {
        this.openId = openId;
    }

    public String getOpenId() 
    {
        return openId;
    }
    public void setUnionId(String unionId) 
    {
        this.unionId = unionId;
    }

    public String getUnionId() 
    {
        return unionId;
    }
    public void setAvatar(String avatar) 
    {
        this.avatar = avatar;
    }

    public String getAvatar() 
    {
        return avatar;
    }
    public void setNickname(String nickname) 
    {
        this.nickname = nickname;
    }

    public String getNickname() 
    {
        return nickname;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setTotalCommission(BigDecimal totalCommission) 
    {
        this.totalCommission = totalCommission;
    }

    public BigDecimal getTotalCommission() 
    {
        return totalCommission;
    }
    public void setWithdrawableCommission(BigDecimal withdrawableCommission) 
    {
        this.withdrawableCommission = withdrawableCommission;
    }

    public BigDecimal getWithdrawableCommission() 
    {
        return withdrawableCommission;
    }
    public void setBalance(BigDecimal balance) 
    {
        this.balance = balance;
    }

    public BigDecimal getBalance() 
    {
        return balance;
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
            .append("username", getUsername())
            .append("password", getPassword())
            .append("phone", getPhone())
            .append("openId", getOpenId())
            .append("unionId", getUnionId())
            .append("avatar", getAvatar())
            .append("nickname", getNickname())
            .append("parentId", getParentId())
            .append("totalCommission", getTotalCommission())
            .append("withdrawableCommission", getWithdrawableCommission())
            .append("balance", getBalance())
            .append("extraField1", getExtraField1())
            .append("extraField2", getExtraField2())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
