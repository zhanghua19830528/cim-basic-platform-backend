package com.cdg.cim.service;

import java.util.List;
import com.cdg.cim.domain.CimOriginalOblique;

/**
 * 原始倾斜摄影Service接口
 * 
 * @author cdg_zhanghua
 * @date 2022-05-23
 */
public interface ICimOriginalObliqueService 
{
    /**
     * 查询原始倾斜摄影
     * 
     * @param id 原始倾斜摄影主键
     * @return 原始倾斜摄影
     */
    public CimOriginalOblique selectCimOriginalObliqueById(Integer id);

    /**
     * 查询原始倾斜摄影列表
     * 
     * @param cimOriginalOblique 原始倾斜摄影
     * @return 原始倾斜摄影集合
     */
    public List<CimOriginalOblique> selectCimOriginalObliqueList(CimOriginalOblique cimOriginalOblique);

    /**
     * 新增原始倾斜摄影
     * 
     * @param cimOriginalOblique 原始倾斜摄影
     * @return 结果
     */
    public int insertCimOriginalOblique(CimOriginalOblique cimOriginalOblique);

    /**
     * 修改原始倾斜摄影
     * 
     * @param cimOriginalOblique 原始倾斜摄影
     * @return 结果
     */
    public int updateCimOriginalOblique(CimOriginalOblique cimOriginalOblique);

    /**
     * 批量删除原始倾斜摄影
     * 
     * @param ids 需要删除的原始倾斜摄影主键集合
     * @return 结果
     */
    public int deleteCimOriginalObliqueByIds(Integer[] ids);

    /**
     * 删除原始倾斜摄影信息
     * 
     * @param id 原始倾斜摄影主键
     * @return 结果
     */
    public int deleteCimOriginalObliqueById(Integer id);
}
