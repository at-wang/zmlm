package com.example.zmlmcore.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <p>
 * 种类树表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("categorytree")
public class CategoryTree implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 种类树主键
     */
    @TableId(value = "categoryTreeId", type = IdType.ASSIGN_UUID)
    private String categoryTreeId;

    /**
     * 种类树内部类型
     */
    @TableField("categoryInsideType")
    private String categoryInsideType;

    /**
     * 种类树外部类型
     */
    @TableField("categoryOutsideType")
    private String categoryOutsideType;

    /**
     * 种类树父主键
     */
    @TableField("categoryParentId")
    private String categoryParentId;

    /**
     * 种类树代码值
     */
    @TableField("categoryCode")
    private String categoryCode;

    /**
     * 种类树代码名字
     */
    @TableField("categoryCodeName")
    private String categoryCodeName;

    /**
     * 种类树父代码值
     */
    @TableField("categoryParentCode")
    private String categoryParentCode;

    /**
     * 种类树排序值
     */
    @TableField("categorySortCode")
    private String categorySortCode;

    /**
     * 备注
     */
    @TableField("categoryRemarks")
    private String categoryRemarks;

    /**
     * 是否有效
     */
    @TableField("whetherEffective")
    private String whetherEffective;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("modifyTime")
    private LocalDateTime modifyTime;


}
