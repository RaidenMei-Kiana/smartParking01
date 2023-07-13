package com.ruoyi.parking.mapper;

import java.util.List;
import com.ruoyi.parking.domain.ChargingRecord;

/**
 * 充电记录Mapper接口
 * 
 * @author sutong
 * @date 2023-07-12
 */
public interface ChargingRecordMapper 
{
    /**
     * 查询充电记录
     * 
     * @param id 充电记录主键
     * @return 充电记录
     */
    public ChargingRecord selectChargingRecordById(Long id);

    /**
     * 查询充电记录列表
     * 
     * @param chargingRecord 充电记录
     * @return 充电记录集合
     */
    public List<ChargingRecord> selectChargingRecordList(ChargingRecord chargingRecord);

    /**
     * 新增充电记录
     * 
     * @param chargingRecord 充电记录
     * @return 结果
     */
    public int insertChargingRecord(ChargingRecord chargingRecord);

    /**
     * 修改充电记录
     * 
     * @param chargingRecord 充电记录
     * @return 结果
     */
    public int updateChargingRecord(ChargingRecord chargingRecord);

    /**
     * 删除充电记录
     * 
     * @param id 充电记录主键
     * @return 结果
     */
    public int deleteChargingRecordById(Long id);

    /**
     * 批量删除充电记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChargingRecordByIds(Long[] ids);
}
