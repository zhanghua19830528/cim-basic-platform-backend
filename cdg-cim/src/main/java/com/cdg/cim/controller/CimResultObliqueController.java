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
import com.cdg.cim.domain.CimResultOblique;
import com.cdg.cim.service.ICimResultObliqueService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 倾斜摄影Controller
 *
 * @author cdg_zhanghua
 * @date 2022-05-23
 */
@RestController
@RequestMapping("/cim/result_oblique")
public class CimResultObliqueController extends BaseController
{
    @Autowired
    private ICimResultObliqueService cimResultObliqueService;

    /**
     * 查询倾斜摄影列表
     */
    @PreAuthorize("@ss.hasPermi('cim:result_oblique:list')")
    @GetMapping("/list")
    public TableDataInfo list(CimResultOblique cimResultOblique)
    {
        startPage();
        List<CimResultOblique> list = cimResultObliqueService.selectCimResultObliqueList(cimResultOblique);
        return getDataTable(list);
    }

    /**
     * 导出倾斜摄影列表
     */
    @PreAuthorize("@ss.hasPermi('cim:result_oblique:export')")
    @Log(title = "倾斜摄影", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CimResultOblique cimResultOblique)
    {
        List<CimResultOblique> list = cimResultObliqueService.selectCimResultObliqueList(cimResultOblique);
        ExcelUtil<CimResultOblique> util = new ExcelUtil<CimResultOblique>(CimResultOblique.class);
        util.exportExcel(response, list, "倾斜摄影数据");
    }

    /**
     * 获取倾斜摄影详细信息
     */
    @PreAuthorize("@ss.hasPermi('cim:result_oblique:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cimResultObliqueService.selectCimResultObliqueById(id));
    }

    /**
     * 新增倾斜摄影
     */
    @PreAuthorize("@ss.hasPermi('cim:result_oblique:add')")
    @Log(title = "倾斜摄影", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CimResultOblique cimResultOblique)
    {
        cimResultOblique.setCreateBy(getUsername());
        return toAjax(cimResultObliqueService.insertCimResultOblique(cimResultOblique));
    }

    /**
     * 修改倾斜摄影
     */
    @PreAuthorize("@ss.hasPermi('cim:result_oblique:edit')")
    @Log(title = "倾斜摄影", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CimResultOblique cimResultOblique)
    {
        cimResultOblique.setUpdateBy(getUsername());
        return toAjax(cimResultObliqueService.updateCimResultOblique(cimResultOblique));
    }

    /**
     * 删除倾斜摄影
     */
    @PreAuthorize("@ss.hasPermi('cim:result_oblique:remove')")
    @Log(title = "倾斜摄影", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cimResultObliqueService.deleteCimResultObliqueByIds(ids));
    }
}
