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
 * 音频审核表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("audioexamine")
public class AudioExamine implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 音频审核主键
     */
    @TableId(value = "audioExamineId", type = IdType.ASSIGN_UUID)
    private String audioExamineId;

    /**
     * 音频主键
     */
    @TableField("audioId")
    private String audioId;

    /**
     * 音频上传用户主键
     */
    @TableField("audioUploadUserId")
    private String audioUploadUserId;

    /**
     * 音频订阅用户主键
     */
    @TableField("audioSubscribeUserId")
    private String audioSubscribeUserId;

    /**
     * 音频封面地址
     */
    @TableField("audioCover")
    private String audioCover;

    /**
     * 音频是否免费-代码项
     */
    @TableField("audioWhetherFree")
    private String audioWhetherFree;

    /**
     * 音频是否vip免费-代码项
     */
    @TableField("audioWhetherVipFree")
    private String audioWhetherVipFree;

    /**
     * 音频播放量
     */
    @TableField("audioPlayCount")
    private Double audioPlayCount;

    /**
     * 音频评分
     */
    @TableField("audioScore")
    private Double audioScore;

    /**
     * 音频名字
     */
    @TableField("audioName")
    private String audioName;

    /**
     * 音频简介
     */
    @TableField("audioBlurb")
    private String audioBlurb;

    /**
     * 音频推荐等级-代码行
     */
    @TableField("audioSuggestLevel")
    private String audioSuggestLevel;

    /**
     * 音频点击量
     */
    @TableField("audioClickCount")
    private Integer audioClickCount;

    /**
     * 是否有效
     */
    @TableField("whetherEffective")
    private String whetherEffective;

    /**
     * 音频总价格
     */
    @TableField("audioPrice")
    private Double audioPrice;

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
