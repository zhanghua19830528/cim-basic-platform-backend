package com.ruoyi.cim.service;

import java.util.List;
import com.ruoyi.cim.domain.CimProject;

/**
 * 项目信息Service接口
 * 
 * @author cdg_zhanghua
 * @date 2022-05-20
 */
public interface ICimProjectService 
{
    /**
     * 查询项目信息
     * 
     * @param id 项目信息主键
     * @return 项目信息
     */
    public CimProject selectCimProjectById(Long id);

    /**
     * 查询项目信息列表
     * 
     * @param cimProject 项目信息
     * @return 项目信息集合
     */
    public List<CimProject> selectCimProjectList(CimProject cimProject);

    /**
     * 新增项目信息
     * 
     * @param cimProject 项目信息
     * @return 结果
     */
    public int insertCimProject(CimProject cimProject);

    /**
     * 修改项目信息
     * 
     * @param cimProject 项目信息
     * @return 结果
     */
    public int updateCimProject(CimProject cimProject);

    /**
     * 批量删除项目信息
     * 
     * @param ids 需要删除的项目信息主键集合
     * @return 结果
     */
    public int deleteCimProjectByIds(Long[] ids);

    /**
     * 删除项目信息信息
     * 
     * @param id 项目信息主键
     * @return 结果
     */
    public int deleteCimProjectById(Long id);
}
