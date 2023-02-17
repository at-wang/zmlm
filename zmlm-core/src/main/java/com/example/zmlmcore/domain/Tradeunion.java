package com.example.zmlmcore.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableField;
/**
 * <p>
 * 工会表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tradeunion")
public class Tradeunion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工会主键
     */
    @TableId(value = "tradeUnionId", type = IdType.ASSIGN_UUID)
    private String tradeUnionId;

    /**
     * 工会名字
     */
    @TableField("tradeUnionName")
    private String tradeUnionName;

    /**
     * 工会会长主键
     */
    @TableField("tradeUnionMasterId")
    private String tradeUnionMasterId;

    /**
     * 工会创立时间
     */
    @TableField("tradeUnionFoundTime")
    private LocalDateTime tradeUnionFoundTime;

    /**
     * 工会人数
     */
    @TableField("tradeUnionPeopleCount")
    private Integer tradeUnionPeopleCount;

    /**
     * 工会头像
     */
    @TableField("tradeUnionPhoto")
    private String tradeUnionPhoto;

    /**
     * 工会标识
     */
    @TableField("tradeUnionLogo")
    private String tradeUnionLogo;

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
