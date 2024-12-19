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
import com.lastant.domain.LifeUser;
import com.lastant.service.ILifeUserService;
import com.lastant.common.utils.poi.ExcelUtil;
import com.lastant.common.core.page.TableDataInfo;

/**
 * 我的用户Controller
 * 
 * @author CrazyLe
 * @date 2024-12-18
 */
@RestController
@RequestMapping("/user/user")
public class LifeUserController extends BaseController
{
    @Autowired
    private ILifeUserService lifeUserService;

    /**
     * 查询我的用户列表
     */
    @PreAuthorize("@ss.hasPermi('user:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(LifeUser lifeUser) {
        startPage();
        List<LifeUser> list = lifeUserService.selectLifeUserList(lifeUser);
        list.forEach(user -> user.setPassword(null));
        return getDataTable(list);
    }


    /**
     * 导出我的用户列表
     */
    @PreAuthorize("@ss.hasPermi('user:user:export')")
    @Log(title = "我的用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LifeUser lifeUser)
    {
        List<LifeUser> list = lifeUserService.selectLifeUserList(lifeUser);
        ExcelUtil<LifeUser> util = new ExcelUtil<LifeUser>(LifeUser.class);
        util.exportExcel(response, list, "我的用户数据");
    }

    /**
     * 获取我的用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('user:user:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(lifeUserService.selectLifeUserById(id));
    }

    /**
     * 新增我的用户
     */
    @PreAuthorize("@ss.hasPermi('user:user:add')")
    @Log(title = "我的用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LifeUser lifeUser)
    {
        return toAjax(lifeUserService.insertLifeUser(lifeUser));
    }

    /**
     * 修改我的用户
     */
    @PreAuthorize("@ss.hasPermi('user:user:edit')")
    @Log(title = "我的用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LifeUser lifeUser)
    {
        return toAjax(lifeUserService.updateLifeUser(lifeUser));
    }

    /**
     * 删除我的用户
     */
    @PreAuthorize("@ss.hasPermi('user:user:remove')")
    @Log(title = "我的用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(lifeUserService.deleteLifeUserByIds(ids));
    }
}
