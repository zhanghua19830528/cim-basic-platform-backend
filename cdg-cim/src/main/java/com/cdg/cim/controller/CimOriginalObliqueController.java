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
import com.cdg.cim.domain.CimOriginalOblique;
import com.cdg.cim.service.ICimOriginalObliqueService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 原始倾斜摄影Controller
 *
 * @author cdg_zhanghua
 * @date 2022-05-23
 */
@RestController
@RequestMapping("/cim/original_oblique")
public class CimOriginalObliqueController extends BaseController
{
    @Autowired
    private ICimOriginalObliqueService cimOriginalObliqueService;

    /**
     * 查询原始倾斜摄影列表
     */
    @PreAuthorize("@ss.hasPermi('cim:original_oblique:list')")
    @GetMapping("/list")
    public TableDataInfo list(CimOriginalOblique cimOriginalOblique)
    {
        startPage();
        List<CimOriginalOblique> list = cimOriginalObliqueService.selectCimOriginalObliqueList(cimOriginalOblique);
        return getDataTable(list);
    }

    /**
     * 导出原始倾斜摄影列表
     */
    @PreAuthorize("@ss.hasPermi('cim:original_oblique:export')")
    @Log(title = "原始倾斜摄影", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CimOriginalOblique cimOriginalOblique)
    {
        List<CimOriginalOblique> list = cimOriginalObliqueService.selectCimOriginalObliqueList(cimOriginalOblique);
        ExcelUtil<CimOriginalOblique> util = new ExcelUtil<CimOriginalOblique>(CimOriginalOblique.class);
        util.exportExcel(response, list, "原始倾斜摄影数据");
    }

    /**
     * 获取原始倾斜摄影详细信息
     */
    @PreAuthorize("@ss.hasPermi('cim:original_oblique:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cimOriginalObliqueService.selectCimOriginalObliqueById(id));
    }

    /**
     * 新增原始倾斜摄影
     */
    @PreAuthorize("@ss.hasPermi('cim:original_oblique:add')")
    @Log(title = "原始倾斜摄影", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CimOriginalOblique cimOriginalOblique)
    {
        return toAjax(cimOriginalObliqueService.insertCimOriginalOblique(cimOriginalOblique));
    }

    /**
     * 修改原始倾斜摄影
     */
    @PreAuthorize("@ss.hasPermi('cim:original_oblique:edit')")
    @Log(title = "原始倾斜摄影", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CimOriginalOblique cimOriginalOblique)
    {
        return toAjax(cimOriginalObliqueService.updateCimOriginalOblique(cimOriginalOblique));
    }

    /**
     * 删除原始倾斜摄影
     */
    @PreAuthorize("@ss.hasPermi('cim:original_oblique:remove')")
    @Log(title = "原始倾斜摄影", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cimOriginalObliqueService.deleteCimOriginalObliqueByIds(ids));
    }
}
