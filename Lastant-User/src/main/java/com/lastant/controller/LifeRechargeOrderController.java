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
import com.lastant.domain.LifeRechargeOrder;
import com.lastant.service.ILifeRechargeOrderService;
import com.lastant.common.utils.poi.ExcelUtil;
import com.lastant.common.core.page.TableDataInfo;

/**
 * 充值订单Controller
 * 
 * @author ruoyi
 * @date 2024-12-18
 */
@RestController
@RequestMapping("/user/order")
public class LifeRechargeOrderController extends BaseController
{
    @Autowired
    private ILifeRechargeOrderService lifeRechargeOrderService;

    /**
     * 查询充值订单列表
     */
    @PreAuthorize("@ss.hasPermi('user:order:list')")
    @GetMapping("/list")
    public TableDataInfo list(LifeRechargeOrder lifeRechargeOrder)
    {
        startPage();
        List<LifeRechargeOrder> list = lifeRechargeOrderService.selectLifeRechargeOrderList(lifeRechargeOrder);

        return getDataTable(list);
    }

    /**
     * 导出充值订单列表
     */
    @PreAuthorize("@ss.hasPermi('user:order:export')")
    @Log(title = "充值订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LifeRechargeOrder lifeRechargeOrder)
    {
        List<LifeRechargeOrder> list = lifeRechargeOrderService.selectLifeRechargeOrderList(lifeRechargeOrder);
        ExcelUtil<LifeRechargeOrder> util = new ExcelUtil<LifeRechargeOrder>(LifeRechargeOrder.class);
        util.exportExcel(response, list, "充值订单数据");
    }

    /**
     * 获取充值订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('user:order:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(lifeRechargeOrderService.selectLifeRechargeOrderById(id));
    }

    /**
     * 新增充值订单
     */
    @PreAuthorize("@ss.hasPermi('user:order:add')")
    @Log(title = "充值订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LifeRechargeOrder lifeRechargeOrder)
    {
        return toAjax(lifeRechargeOrderService.insertLifeRechargeOrder(lifeRechargeOrder));
    }

    /**
     * 修改充值订单
     */
    @PreAuthorize("@ss.hasPermi('user:order:edit')")
    @Log(title = "充值订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LifeRechargeOrder lifeRechargeOrder)
    {
        return toAjax(lifeRechargeOrderService.updateLifeRechargeOrder(lifeRechargeOrder));
    }

    /**
     * 删除充值订单
     */
    @PreAuthorize("@ss.hasPermi('user:order:remove')")
    @Log(title = "充值订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(lifeRechargeOrderService.deleteLifeRechargeOrderByIds(ids));
    }
}
