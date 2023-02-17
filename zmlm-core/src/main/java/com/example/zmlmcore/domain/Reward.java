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
 * 奖励表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("reward")
public class Reward implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 奖励主键
     */
    @TableId(value = "rewardId", type = IdType.ASSIGN_UUID)
    private String rewardId;

    /**
     * 用户主键
     */
    @TableField("userId")
    private String userId;

    /**
     * 工会主键
     */
    @TableField("tradeUnionId")
    private String tradeUnionId;

    /**
     * 奖励方式-代码项
     */
    @TableField("rewardWay")
    private String rewardWay;

    /**
     * 奖励原因
     */
    @TableField("rewardReason")
    private String rewardReason;

    /**
     * 奖励金额
     */
    @TableField("rewardMoney")
    private Double rewardMoney;

    /**
     * 奖励物品
     */
    @TableField("rewardGoods")
    private String rewardGoods;

    /**
     * 奖励名字
     */
    @TableField("rewardName")
    private String rewardName;

    /**
     * 奖励封面图
     */
    @TableField("rewardCover")
    private String rewardCover;

    /**
     * 奖励日期
     */
    @TableField("rewardDate")
    private LocalDateTime rewardDate;

    /**
     * 奖励是否成功-代码项
     */
    @TableField("rewardWhetherSuccess")
    private String rewardWhetherSuccess;

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
