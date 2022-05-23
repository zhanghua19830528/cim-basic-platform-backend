package com.cdg.cim.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cdg.cim.mapper.CimOriginalObliqueMapper;
import com.cdg.cim.domain.CimOriginalOblique;
import com.cdg.cim.service.ICimOriginalObliqueService;

/**
 * 原始倾斜摄影Service业务层处理
 * 
 * @author cdg_zhanghua
 * @date 2022-05-23
 */
@Service
public class CimOriginalObliqueServiceImpl implements ICimOriginalObliqueService 
{
    @Autowired
    private CimOriginalObliqueMapper cimOriginalObliqueMapper;

    /**
     * 查询原始倾斜摄影
     * 
     * @param id 原始倾斜摄影主键
     * @return 原始倾斜摄影
     */
    @Override
    public CimOriginalOblique selectCimOriginalObliqueById(Integer id)
    {
        return cimOriginalObliqueMapper.selectCimOriginalObliqueById(id);
    }

    /**
     * 查询原始倾斜摄影列表
     * 
     * @param cimOriginalOblique 原始倾斜摄影
     * @return 原始倾斜摄影
     */
    @Override
    public List<CimOriginalOblique> selectCimOriginalObliqueList(CimOriginalOblique cimOriginalOblique)
    {
        return cimOriginalObliqueMapper.selectCimOriginalObliqueList(cimOriginalOblique);
    }

    /**
     * 新增原始倾斜摄影
     * 
     * @param cimOriginalOblique 原始倾斜摄影
     * @return 结果
     */
    @Override
    public int insertCimOriginalOblique(CimOriginalOblique cimOriginalOblique)
    {
        cimOriginalOblique.setCreateTime(DateUtils.getNowDate());
        return cimOriginalObliqueMapper.insertCimOriginalOblique(cimOriginalOblique);
    }

    /**
     * 修改原始倾斜摄影
     * 
     * @param cimOriginalOblique 原始倾斜摄影
     * @return 结果
     */
    @Override
    public int updateCimOriginalOblique(CimOriginalOblique cimOriginalOblique)
    {
        cimOriginalOblique.setUpdateTime(DateUtils.getNowDate());
        return cimOriginalObliqueMapper.updateCimOriginalOblique(cimOriginalOblique);
    }

    /**
     * 批量删除原始倾斜摄影
     * 
     * @param ids 需要删除的原始倾斜摄影主键
     * @return 结果
     */
    @Override
    public int deleteCimOriginalObliqueByIds(Integer[] ids)
    {
        return cimOriginalObliqueMapper.deleteCimOriginalObliqueByIds(ids);
    }

    /**
     * 删除原始倾斜摄影信息
     * 
     * @param id 原始倾斜摄影主键
     * @return 结果
     */
    @Override
    public int deleteCimOriginalObliqueById(Integer id)
    {
        return cimOriginalObliqueMapper.deleteCimOriginalObliqueById(id);
    }
}
