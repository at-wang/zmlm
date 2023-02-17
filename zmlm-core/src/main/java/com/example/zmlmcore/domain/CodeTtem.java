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
 * 代码项表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("codeitem")
public class CodeTtem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代码项主键
     */
    @TableId(value = "codeId", type = IdType.ASSIGN_UUID)
    private String codeId;

    /**
     * 代码类别
     */
    @TableField("codeType")
    private String codeType;

    /**
     * 代码类别名称
     */
    @TableField("codeTypeName")
    private String codeTypeName;

    /**
     * 代码值
     */
    @TableField("codeValue")
    private String codeValue;

    /**
     * 代码值名称
     */
    @TableField("codeValueName")
    private String codeValueName;

    /**
     * 代码序号
     */
    @TableField("codeSort")
    private String codeSort;

    /**
     * 代码备注
     */
    @TableField("codeRemarks")
    private String codeRemarks;

    /**
     * 代码项是否有效（1有效，0无效）
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
