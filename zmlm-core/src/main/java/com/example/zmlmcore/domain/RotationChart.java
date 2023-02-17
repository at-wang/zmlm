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
 * 轮播图表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("rotationchart")
public class RotationChart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 轮播图主键
     */
    @TableId(value = "rotationChartId", type = IdType.ASSIGN_UUID)
    private String rotationChartId;

    /**
     * 音频主键
     */
    @TableField("audioId")
    private String audioId;

    /**
     * 轮播图开始时间
     */
    @TableField("rotationChartStartTime")
    private LocalDateTime rotationChartStartTime;

    /**
     * 轮播图结束时间
     */
    @TableField("rotationChartEndTime")
    private LocalDateTime rotationChartEndTime;

    /**
     * 是否有效
     */
    @TableField("whetherEffective")
    private String whetherEffective;

    /**
     * 推荐人
     */
    @TableField("recommendPeople")
    private String recommendPeople;

    /**
     * 推荐理由
     */
    @TableField("recommendReason")
    private String recommendReason;

    /**
     * 序号
     */
    @TableField("rotationChartOrder")
    private Integer rotationChartOrder;

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
