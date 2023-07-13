package com.ruoyi.parking.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.parking.mapper.ParkingSlotMapper;
import com.ruoyi.parking.domain.ParkingSlot;
import com.ruoyi.parking.service.IParkingSlotService;

/**
 * 停车位Service业务层处理
 * 
 * @author sutong
 * @date 2023-07-12
 */
@Service
public class ParkingSlotServiceImpl implements IParkingSlotService 
{
    @Autowired
    private ParkingSlotMapper parkingSlotMapper;

    /**
     * 查询停车位
     * 
     * @param id 停车位主键
     * @return 停车位
     */
    @Override
    public ParkingSlot selectParkingSlotById(Long id)
    {
        return parkingSlotMapper.selectParkingSlotById(id);
    }

    /**
     * 查询停车位列表
     * 
     * @param parkingSlot 停车位
     * @return 停车位
     */
    @Override
    public List<ParkingSlot> selectParkingSlotList(ParkingSlot parkingSlot)
    {
        return parkingSlotMapper.selectParkingSlotList(parkingSlot);
    }

    /**
     * 新增停车位
     * 
     * @param parkingSlot 停车位
     * @return 结果
     */
    @Override
    public int insertParkingSlot(ParkingSlot parkingSlot)
    {
        return parkingSlotMapper.insertParkingSlot(parkingSlot);
    }

    /**
     * 修改停车位
     * 
     * @param parkingSlot 停车位
     * @return 结果
     */
    @Override
    public int updateParkingSlot(ParkingSlot parkingSlot)
    {
        return parkingSlotMapper.updateParkingSlot(parkingSlot);
    }

    /**
     * 批量删除停车位
     * 
     * @param ids 需要删除的停车位主键
     * @return 结果
     */
    @Override
    public int deleteParkingSlotByIds(Long[] ids)
    {
        return parkingSlotMapper.deleteParkingSlotByIds(ids);
    }

    /**
     * 删除停车位信息
     * 
     * @param id 停车位主键
     * @return 结果
     */
    @Override
    public int deleteParkingSlotById(Long id)
    {
        return parkingSlotMapper.deleteParkingSlotById(id);
    }
}
