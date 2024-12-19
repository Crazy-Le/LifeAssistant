package com.lastant.controller;

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
import com.lastant.common.annotation.Log;
import com.lastant.common.core.controller.BaseController;
import com.lastant.common.core.domain.AjaxResult;
import com.lastant.common.enums.BusinessType;
import com.lastant.domain.LifeElectricMeter;
import com.lastant.service.ILifeElectricMeterService;
import com.lastant.common.utils.poi.ExcelUtil;
import com.lastant.common.core.page.TableDataInfo;

/**
 * 全部电表Controller
 * 
 * @author CrazyLe
 * @date 2024-12-18
 */
@RestController
@RequestMapping("/electric/meter")
public class LifeElectricMeterController extends BaseController
{
    @Autowired
    private ILifeElectricMeterService lifeElectricMeterService;

    /**
     * 查询全部电表列表
     */
    @PreAuthorize("@ss.hasPermi('electric:meter:list')")
    @GetMapping("/list")
    public TableDataInfo list(LifeElectricMeter lifeElectricMeter)
    {
        startPage();
        List<LifeElectricMeter> list = lifeElectricMeterService.selectLifeElectricMeterList(lifeElectricMeter);
        return getDataTable(list);
    }

    /**
     * 导出全部电表列表
     */
    @PreAuthorize("@ss.hasPermi('electric:meter:export')")
    @Log(title = "全部电表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LifeElectricMeter lifeElectricMeter)
    {
        List<LifeElectricMeter> list = lifeElectricMeterService.selectLifeElectricMeterList(lifeElectricMeter);
        ExcelUtil<LifeElectricMeter> util = new ExcelUtil<LifeElectricMeter>(LifeElectricMeter.class);
        util.exportExcel(response, list, "全部电表数据");
    }

    /**
     * 获取全部电表详细信息
     */
    @PreAuthorize("@ss.hasPermi('electric:meter:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(lifeElectricMeterService.selectLifeElectricMeterById(id));
    }

    /**
     * 新增全部电表
     */
    @PreAuthorize("@ss.hasPermi('electric:meter:add')")
    @Log(title = "全部电表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LifeElectricMeter lifeElectricMeter)
    {
        return toAjax(lifeElectricMeterService.insertLifeElectricMeter(lifeElectricMeter));
    }

    /**
     * 修改全部电表
     */
    @PreAuthorize("@ss.hasPermi('electric:meter:edit')")
    @Log(title = "全部电表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LifeElectricMeter lifeElectricMeter)
    {
        return toAjax(lifeElectricMeterService.updateLifeElectricMeter(lifeElectricMeter));
    }

    /**
     * 删除全部电表
     */
    @PreAuthorize("@ss.hasPermi('electric:meter:remove')")
    @Log(title = "全部电表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(lifeElectricMeterService.deleteLifeElectricMeterByIds(ids));
    }
}
