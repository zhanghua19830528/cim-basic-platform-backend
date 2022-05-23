package com.cdg.cim.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 原始倾斜摄影对象 cim_original_oblique
 * 
 * @author cdg_zhanghua
 * @date 2022-05-23
 */
public class CimOriginalOblique extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Integer id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 存储路径 */
    @Excel(name = "存储路径")
    private String path;

    /** 空间参考 */
    @Excel(name = "空间参考")
    private String srs;

    /** 模型零点 */
    @Excel(name = "模型零点")
    private String srsOrigin;

    /** 文件长度（MB） */
    @Excel(name = "文件长度", readConverterExp = "M=B")
    private String length;

    /** 是否公开 */
    @Excel(name = "是否公开")
    private String publicFlag;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String source;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 删除标志 */
    private String delFlag;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPath(String path) 
    {
        this.path = path;
    }

    public String getPath() 
    {
        return path;
    }
    public void setSrs(String srs) 
    {
        this.srs = srs;
    }

    public String getSrs() 
    {
        return srs;
    }
    public void setSrsOrigin(String srsOrigin) 
    {
        this.srsOrigin = srsOrigin;
    }

    public String getSrsOrigin() 
    {
        return srsOrigin;
    }
    public void setLength(String length) 
    {
        this.length = length;
    }

    public String getLength() 
    {
        return length;
    }
    public void setPublicFlag(String publicFlag) 
    {
        this.publicFlag = publicFlag;
    }

    public String getPublicFlag() 
    {
        return publicFlag;
    }
    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("path", getPath())
            .append("srs", getSrs())
            .append("srsOrigin", getSrsOrigin())
            .append("length", getLength())
            .append("publicFlag", getPublicFlag())
            .append("source", getSource())
            .append("description", getDescription())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
