package com.ruoyi.parking.service;

import java.util.List;
import com.ruoyi.parking.domain.ParkingRecord;

/**
 * 停车记录Service接口
 * 
 * @author sutong
 * @date 2023-07-12
 */
public interface IParkingRecordService 
{
    /**
     * 查询停车记录
     * 
     * @param id 停车记录主键
     * @return 停车记录
     */
    public ParkingRecord selectParkingRecordById(Long id);

    /**
     * 查询停车记录列表
     * 
     * @param parkingRecord 停车记录
     * @return 停车记录集合
     */
    public List<ParkingRecord> selectParkingRecordList(ParkingRecord parkingRecord);

    /**
     * 新增停车记录
     * 
     * @param parkingRecord 停车记录
     * @return 结果
     */
    public int insertParkingRecord(ParkingRecord parkingRecord);

    /**
     * 修改停车记录
     * 
     * @param parkingRecord 停车记录
     * @return 结果
     */
    public int updateParkingRecord(ParkingRecord parkingRecord);

    /**
     * 批量删除停车记录
     * 
     * @param ids 需要删除的停车记录主键集合
     * @return 结果
     */
    public int deleteParkingRecordByIds(Long[] ids);

    /**
     * 删除停车记录信息
     * 
     * @param id 停车记录主键
     * @return 结果
     */
    public int deleteParkingRecordById(Long id);
}
