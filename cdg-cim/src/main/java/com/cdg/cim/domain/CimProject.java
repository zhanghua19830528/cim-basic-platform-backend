package com.cdg.cim.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目信息对象 cim_project
 * 
 * @author cdg_zhanghua
 * @date 2022-05-21
 */
public class CimProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识 */
    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String name;

    /** 项目编号 */
    @Excel(name = "项目编号")
    private String number;

    /** 项目描述 */
    @Excel(name = "项目描述")
    private String description;

    /** 行业 */
    @Excel(name = "行业")
    private String industry;

    /** 设计阶段 */
    @Excel(name = "设计阶段")
    private String stage;

    /** 工程总投资(万元) */
    @Excel(name = "工程总投资(万元)")
    private Double investment;

    /** 建设单位 */
    @Excel(name = "建设单位")
    private String constructionCompany;

    /** 设计单位 */
    @Excel(name = "设计单位")
    private String designCompany;

    /** 删除标志 */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
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
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
    {
        return number;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setIndustry(String industry) 
    {
        this.industry = industry;
    }

    public String getIndustry() 
    {
        return industry;
    }
    public void setStage(String stage) 
    {
        this.stage = stage;
    }

    public String getStage() 
    {
        return stage;
    }
    public void setInvestment(Double investment) 
    {
        this.investment = investment;
    }

    public Double getInvestment() 
    {
        return investment;
    }
    public void setConstructionCompany(String constructionCompany) 
    {
        this.constructionCompany = constructionCompany;
    }

    public String getConstructionCompany() 
    {
        return constructionCompany;
    }
    public void setDesignCompany(String designCompany) 
    {
        this.designCompany = designCompany;
    }

    public String getDesignCompany() 
    {
        return designCompany;
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
            .append("number", getNumber())
            .append("description", getDescription())
            .append("industry", getIndustry())
            .append("stage", getStage())
            .append("investment", getInvestment())
            .append("constructionCompany", getConstructionCompany())
            .append("designCompany", getDesignCompany())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
