package com.ruoyi.parking.mapper;

import java.util.List;
import com.ruoyi.parking.domain.Customer;
import org.springframework.stereotype.Repository;

/**
 * 用户Mapper接口
 * 
 * @author sutong
 * @date 2023-07-12
 */@Repository
public interface CustomerMapper 
{
    /**
     * 查询用户
     * 
     * @param id 用户主键
     * @return 用户
     */
    public Customer selectCustomerById(Long id);

    /**
     * 查询用户列表
     * 
     * @param customer 用户
     * @return 用户集合
     */
    public List<Customer> selectCustomerList(Customer customer);

    /**
     * 新增用户
     * 
     * @param customer 用户
     * @return 结果
     */
    public int insertCustomer(Customer customer);

    /**
     * 修改用户
     * 
     * @param customer 用户
     * @return 结果
     */
    public int updateCustomer(Customer customer);

    /**
     * 删除用户
     * 
     * @param id 用户主键
     * @return 结果
     */
    public int deleteCustomerById(Long id);

    /**
     * 批量删除用户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCustomerByIds(Long[] ids);
}
