package com.ruoyi.parking.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.parking.domain.ChargingRecord;
import com.ruoyi.parking.service.IChargingRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 充电记录Controller
 * 
 * @author sutong
 * @date 2023-07-12
 */
@RestController
@RequestMapping("/parking/record")
public class ChargingRecordController extends BaseController
{
    @Autowired
    private IChargingRecordService chargingRecordService;

    /**
     * 查询充电记录列表
     */
    @PreAuthorize("@ss.hasPermi('parking:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(ChargingRecord chargingRecord)
    {
        startPage();
        List<ChargingRecord> list = chargingRecordService.selectChargingRecordList(chargingRecord);
        return getDataTable(list);
    }

    /**
     * 导出充电记录列表
     */
    @PreAuthorize("@ss.hasPermi('parking:record:export')")
    @Log(title = "充电记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ChargingRecord chargingRecord)
    {
        List<ChargingRecord> list = chargingRecordService.selectChargingRecordList(chargingRecord);
        ExcelUtil<ChargingRecord> util = new ExcelUtil<ChargingRecord>(ChargingRecord.class);
        util.exportExcel(response, list, "充电记录数据");
    }

    /**
     * 获取充电记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('parking:record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(chargingRecordService.selectChargingRecordById(id));
    }

    /**
     * 新增充电记录
     */
    @PreAuthorize("@ss.hasPermi('parking:record:add')")
    @Log(title = "充电记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ChargingRecord chargingRecord)
    {
        return toAjax(chargingRecordService.insertChargingRecord(chargingRecord));
    }

    /**
     * 修改充电记录
     */
    @PreAuthorize("@ss.hasPermi('parking:record:edit')")
    @Log(title = "充电记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ChargingRecord chargingRecord)
    {
        return toAjax(chargingRecordService.updateChargingRecord(chargingRecord));
    }

    /**
     * 删除充电记录
     */
    @PreAuthorize("@ss.hasPermi('parking:record:remove')")
    @Log(title = "充电记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(chargingRecordService.deleteChargingRecordByIds(ids));
    }
}
