package com.ruoyi.cim.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cim.mapper.CimProjectMapper;
import com.ruoyi.cim.domain.CimProject;
import com.ruoyi.cim.service.ICimProjectService;

/**
 * 项目信息Service业务层处理
 * 
 * @author cdg_zhanghua
 * @date 2022-05-20
 */
@Service
public class CimProjectServiceImpl implements ICimProjectService 
{
    @Autowired
    private CimProjectMapper cimProjectMapper;

    /**
     * 查询项目信息
     * 
     * @param id 项目信息主键
     * @return 项目信息
     */
    @Override
    public CimProject selectCimProjectById(Long id)
    {
        return cimProjectMapper.selectCimProjectById(id);
    }

    /**
     * 查询项目信息列表
     * 
     * @param cimProject 项目信息
     * @return 项目信息
     */
    @Override
    public List<CimProject> selectCimProjectList(CimProject cimProject)
    {
        return cimProjectMapper.selectCimProjectList(cimProject);
    }

    /**
     * 新增项目信息
     * 
     * @param cimProject 项目信息
     * @return 结果
     */
    @Override
    public int insertCimProject(CimProject cimProject)
    {
        cimProject.setCreateTime(DateUtils.getNowDate());
        return cimProjectMapper.insertCimProject(cimProject);
    }

    /**
     * 修改项目信息
     * 
     * @param cimProject 项目信息
     * @return 结果
     */
    @Override
    public int updateCimProject(CimProject cimProject)
    {
        cimProject.setUpdateTime(DateUtils.getNowDate());
        return cimProjectMapper.updateCimProject(cimProject);
    }

    /**
     * 批量删除项目信息
     * 
     * @param ids 需要删除的项目信息主键
     * @return 结果
     */
    @Override
    public int deleteCimProjectByIds(Long[] ids)
    {
        return cimProjectMapper.deleteCimProjectByIds(ids);
    }

    /**
     * 删除项目信息信息
     * 
     * @param id 项目信息主键
     * @return 结果
     */
    @Override
    public int deleteCimProjectById(Long id)
    {
        return cimProjectMapper.deleteCimProjectById(id);
    }
}
