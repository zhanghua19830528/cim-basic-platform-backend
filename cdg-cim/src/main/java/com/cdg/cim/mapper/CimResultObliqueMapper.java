package com.cdg.cim.mapper;

import java.util.List;
import com.cdg.cim.domain.CimResultOblique;

/**
 * 倾斜摄影Mapper接口
 * 
 * @author cdg_zhanghua
 * @date 2022-05-23
 */
public interface CimResultObliqueMapper 
{
    /**
     * 查询倾斜摄影
     * 
     * @param id 倾斜摄影主键
     * @return 倾斜摄影
     */
    public CimResultOblique selectCimResultObliqueById(Integer id);

    /**
     * 查询倾斜摄影列表
     * 
     * @param cimResultOblique 倾斜摄影
     * @return 倾斜摄影集合
     */
    public List<CimResultOblique> selectCimResultObliqueList(CimResultOblique cimResultOblique);

    /**
     * 新增倾斜摄影
     * 
     * @param cimResultOblique 倾斜摄影
     * @return 结果
     */
    public int insertCimResultOblique(CimResultOblique cimResultOblique);

    /**
     * 修改倾斜摄影
     * 
     * @param cimResultOblique 倾斜摄影
     * @return 结果
     */
    public int updateCimResultOblique(CimResultOblique cimResultOblique);

    /**
     * 删除倾斜摄影
     * 
     * @param id 倾斜摄影主键
     * @return 结果
     */
    public int deleteCimResultObliqueById(Integer id);

    /**
     * 批量删除倾斜摄影
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCimResultObliqueByIds(Integer[] ids);
}
