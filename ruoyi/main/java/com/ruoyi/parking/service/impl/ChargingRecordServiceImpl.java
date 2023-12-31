package com.ruoyi.parking.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.parking.mapper.ChargingRecordMapper;
import com.ruoyi.parking.domain.ChargingRecord;
import com.ruoyi.parking.service.IChargingRecordService;

/**
 * 充电记录Service业务层处理
 * 
 * @author sutong
 * @date 2023-07-12
 */
@Service
public class ChargingRecordServiceImpl implements IChargingRecordService 
{
    @Autowired
    private ChargingRecordMapper chargingRecordMapper;

    /**
     * 查询充电记录
     * 
     * @param id 充电记录主键
     * @return 充电记录
     */
    @Override
    public ChargingRecord selectChargingRecordById(Long id)
    {
        return chargingRecordMapper.selectChargingRecordById(id);
    }

    /**
     * 查询充电记录列表
     * 
     * @param chargingRecord 充电记录
     * @return 充电记录
     */
    @Override
    public List<ChargingRecord> selectChargingRecordList(ChargingRecord chargingRecord)
    {
        return chargingRecordMapper.selectChargingRecordList(chargingRecord);
    }

    /**
     * 新增充电记录
     * 
     * @param chargingRecord 充电记录
     * @return 结果
     */
    @Override
    public int insertChargingRecord(ChargingRecord chargingRecord)
    {
        return chargingRecordMapper.insertChargingRecord(chargingRecord);
    }

    /**
     * 修改充电记录
     * 
     * @param chargingRecord 充电记录
     * @return 结果
     */
    @Override
    public int updateChargingRecord(ChargingRecord chargingRecord)
    {
        return chargingRecordMapper.updateChargingRecord(chargingRecord);
    }

    /**
     * 批量删除充电记录
     * 
     * @param ids 需要删除的充电记录主键
     * @return 结果
     */
    @Override
    public int deleteChargingRecordByIds(Long[] ids)
    {
        return chargingRecordMapper.deleteChargingRecordByIds(ids);
    }

    /**
     * 删除充电记录信息
     * 
     * @param id 充电记录主键
     * @return 结果
     */
    @Override
    public int deleteChargingRecordById(Long id)
    {
        return chargingRecordMapper.deleteChargingRecordById(id);
    }
}
