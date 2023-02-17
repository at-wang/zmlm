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
 * 音频内容审核表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("audiocontentexamine")
public class AudioContentExamine implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 音频内容审核主键
     */
    @TableId(value = "audioContentExamineId", type = IdType.ASSIGN_UUID)
    private String audioContentExamineId;

    /**
     * 音频内容主键
     */
    @TableField("contentId")
    private String contentId;

    /**
     * 内容支付主键
     */
    @TableField("contentPayId")
    private String contentPayId;

    /**
     * 评论主键
     */
    @TableField("commentId")
    private String commentId;

    /**
     * 音频主键
     */
    @TableField("audioId")
    private String audioId;

    /**
     * 内容集数
     */
    @TableField("contentNumber")
    private Long contentNumber;

    /**
     * 播放量/集
     */
    @TableField("contentPlayCount")
    private Double contentPlayCount;

    /**
     * 内容购买方式-代码项
     */
    @TableField("contentBuyWay")
    private String contentBuyWay;

    /**
     * 名字/集
     */
    @TableField("contentName")
    private String contentName;

    /**
     * 多少秒钟/集
     */
    @TableField("contentTime")
    private Integer contentTime;

    /**
     * 音频价格/集
     */
    @TableField("contentPrice")
    private Double contentPrice;

    /**
     * 音频上一条链接
     */
    @TableField("contentPreviousAddress")
    private String contentPreviousAddress;

    /**
     * 音频地址
     */
    @TableField("contentAddress")
    private String contentAddress;

    /**
     * 音频下一条链接
     */
    @TableField("contentNextAddress")
    private String contentNextAddress;

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

    /**
     * 审核时间
     */
    @TableField("examineTime")
    private LocalDateTime examineTime;

    /**
     * 审核人
     */
    @TableField("examinePeople")
    private String examinePeople;

    /**
     * 审核状态-代码项
     */
    @TableField("examineState")
    private String examineState;


}
