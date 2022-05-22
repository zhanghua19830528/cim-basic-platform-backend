package com.cdg.cim.controller;

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
import com.cdg.cim.domain.CimProject;
import com.cdg.cim.service.ICimProjectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目信息Controller
 *
 * @author cdg_zhanghua
 * @date 2022-05-21
 */

@RestController
@RequestMapping("/cim/project")
public class CimProjectController extends BaseController
{
    @Autowired
    private ICimProjectService cimProjectService;

    /**
     * 查询项目信息列表
     */

    @PreAuthorize("@ss.hasPermi('cim:project:list')")
    @GetMapping("/list")
    public TableDataInfo list(CimProject cimProject)
    {
        startPage();
        List<CimProject> list = cimProjectService.selectCimProjectList(cimProject);
        return getDataTable(list);
    }

    /**
     * 导出项目信息列表
     */
    @PreAuthorize("@ss.hasPermi('cim:project:export')")
    @Log(title = "项目信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CimProject cimProject)
    {
        List<CimProject> list = cimProjectService.selectCimProjectList(cimProject);
        ExcelUtil<CimProject> util = new ExcelUtil<CimProject>(CimProject.class);
        util.exportExcel(response, list, "项目信息数据");
    }

    /**
     * 获取项目信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('cim:project:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(cimProjectService.selectCimProjectById(id));
    }

    /**
     * 新增项目信息
     */
    @PreAuthorize("@ss.hasPermi('cim:project:add')")
    @Log(title = "项目信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CimProject cimProject)
    {
        return toAjax(cimProjectService.insertCimProject(cimProject));
    }

    /**
     * 修改项目信息
     */
    @PreAuthorize("@ss.hasPermi('cim:project:edit')")
    @Log(title = "项目信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CimProject cimProject)
    {
        return toAjax(cimProjectService.updateCimProject(cimProject));
    }

    /**
     * 删除项目信息
     */
    @PreAuthorize("@ss.hasPermi('cim:project:remove')")
    @Log(title = "项目信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(cimProjectService.deleteCimProjectByIds(ids));
    }
}
