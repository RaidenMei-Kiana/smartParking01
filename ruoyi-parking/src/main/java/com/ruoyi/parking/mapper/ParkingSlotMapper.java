package com.ruoyi.parking.mapper;

import java.util.List;
import com.ruoyi.parking.domain.ParkingSlot;

/**
 * 停车位Mapper接口
 * 
 * @author sutong
 * @date 2023-07-12
 */
public interface ParkingSlotMapper 
{
    /**
     * 查询停车位
     * 
     * @param id 停车位主键
     * @return 停车位
     */
    public ParkingSlot selectParkingSlotById(Long id);

    /**
     * 查询停车位列表
     * 
     * @param parkingSlot 停车位
     * @return 停车位集合
     */
    public List<ParkingSlot> selectParkingSlotList(ParkingSlot parkingSlot);

    /**
     * 新增停车位
     * 
     * @param parkingSlot 停车位
     * @return 结果
     */
    public int insertParkingSlot(ParkingSlot parkingSlot);

    /**
     * 修改停车位
     * 
     * @param parkingSlot 停车位
     * @return 结果
     */
    public int updateParkingSlot(ParkingSlot parkingSlot);

    /**
     * 删除停车位
     * 
     * @param id 停车位主键
     * @return 结果
     */
    public int deleteParkingSlotById(Long id);

    /**
     * 批量删除停车位
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteParkingSlotByIds(Long[] ids);
}
