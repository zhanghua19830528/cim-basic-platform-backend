package com.cdg.cim.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cdg.cim.mapper.CimResultObliqueMapper;
import com.cdg.cim.domain.CimResultOblique;
import com.cdg.cim.service.ICimResultObliqueService;

/**
 * 倾斜摄影Service业务层处理
 * 
 * @author cdg_zhanghua
 * @date 2022-05-23
 */
@Service
public class CimResultObliqueServiceImpl implements ICimResultObliqueService 
{
    @Autowired
    private CimResultObliqueMapper cimResultObliqueMapper;

    /**
     * 查询倾斜摄影
     * 
     * @param id 倾斜摄影主键
     * @return 倾斜摄影
     */
    @Override
    public CimResultOblique selectCimResultObliqueById(Integer id)
    {
        return cimResultObliqueMapper.selectCimResultObliqueById(id);
    }

    /**
     * 查询倾斜摄影列表
     * 
     * @param cimResultOblique 倾斜摄影
     * @return 倾斜摄影
     */
    @Override
    public List<CimResultOblique> selectCimResultObliqueList(CimResultOblique cimResultOblique)
    {
        return cimResultObliqueMapper.selectCimResultObliqueList(cimResultOblique);
    }

    /**
     * 新增倾斜摄影
     * 
     * @param cimResultOblique 倾斜摄影
     * @return 结果
     */
    @Override
    public int insertCimResultOblique(CimResultOblique cimResultOblique)
    {
        cimResultOblique.setCreateTime(DateUtils.getNowDate());
        return cimResultObliqueMapper.insertCimResultOblique(cimResultOblique);
    }

    /**
     * 修改倾斜摄影
     * 
     * @param cimResultOblique 倾斜摄影
     * @return 结果
     */
    @Override
    public int updateCimResultOblique(CimResultOblique cimResultOblique)
    {
        cimResultOblique.setUpdateTime(DateUtils.getNowDate());
        return cimResultObliqueMapper.updateCimResultOblique(cimResultOblique);
    }

    /**
     * 批量删除倾斜摄影
     * 
     * @param ids 需要删除的倾斜摄影主键
     * @return 结果
     */
    @Override
    public int deleteCimResultObliqueByIds(Integer[] ids)
    {
        return cimResultObliqueMapper.deleteCimResultObliqueByIds(ids);
    }

    /**
     * 删除倾斜摄影信息
     * 
     * @param id 倾斜摄影主键
     * @return 结果
     */
    @Override
    public int deleteCimResultObliqueById(Integer id)
    {
        return cimResultObliqueMapper.deleteCimResultObliqueById(id);
    }
}
