package com.ruoyi.web.controller.parking;

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
import com.ruoyi.parking.domain.ParkingSlot;
import com.ruoyi.parking.service.IParkingSlotService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 停车位Controller
 * 
 * @author sutong
 * @date 2023-07-12
 */
@RestController
@RequestMapping("/parking/slot")
public class ParkingSlotController extends BaseController
{
    @Autowired
    private IParkingSlotService parkingSlotService;

    /**
     * 查询停车位列表
     */
    @PreAuthorize("@ss.hasPermi('parking:slot:list')")
    @GetMapping("/list")
    public TableDataInfo list(ParkingSlot parkingSlot)
    {
        startPage();
        List<ParkingSlot> list = parkingSlotService.selectParkingSlotList(parkingSlot);
        return getDataTable(list);
    }

    /**
     * 导出停车位列表
     */
    @PreAuthorize("@ss.hasPermi('parking:slot:export')")
    @Log(title = "停车位", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ParkingSlot parkingSlot)
    {
        List<ParkingSlot> list = parkingSlotService.selectParkingSlotList(parkingSlot);
        ExcelUtil<ParkingSlot> util = new ExcelUtil<ParkingSlot>(ParkingSlot.class);
        util.exportExcel(response, list, "停车位数据");
    }

    /**
     * 获取停车位详细信息
     */
    @PreAuthorize("@ss.hasPermi('parking:slot:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(parkingSlotService.selectParkingSlotById(id));
    }

    /**
     * 新增停车位
     */
    @PreAuthorize("@ss.hasPermi('parking:slot:add')")
    @Log(title = "停车位", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ParkingSlot parkingSlot)
    {
        return toAjax(parkingSlotService.insertParkingSlot(parkingSlot));
    }

    /**
     * 修改停车位
     */
    @PreAuthorize("@ss.hasPermi('parking:slot:edit')")
    @Log(title = "停车位", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ParkingSlot parkingSlot)
    {
        return toAjax(parkingSlotService.updateParkingSlot(parkingSlot));
    }

    /**
     * 删除停车位
     */
    @PreAuthorize("@ss.hasPermi('parking:slot:remove')")
    @Log(title = "停车位", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(parkingSlotService.deleteParkingSlotByIds(ids));
    }
}
