package com.ruoyi.parking.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户对象 customer
 * 
 * @author sutong
 * @date 2023-07-12
 */
public class Customer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String name;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String licensePlate;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 微信登录标识 */
    @Excel(name = "微信登录标识")
    private String wechatOpenid;

    /** 充值余额 */
    @Excel(name = "充值余额")
    private BigDecimal balance;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setLicensePlate(String licensePlate) 
    {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() 
    {
        return licensePlate;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setWechatOpenid(String wechatOpenid) 
    {
        this.wechatOpenid = wechatOpenid;
    }

    public String getWechatOpenid() 
    {
        return wechatOpenid;
    }
    public void setBalance(BigDecimal balance) 
    {
        this.balance = balance;
    }

    public BigDecimal getBalance() 
    {
        return balance;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("licensePlate", getLicensePlate())
            .append("phone", getPhone())
            .append("wechatOpenid", getWechatOpenid())
            .append("balance", getBalance())
            .toString();
    }
}
