package com.example.zmlmcore.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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

/**
 * <p>
 * 音频表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("audio")
public class Audio implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 音频主键
     */
    @TableId(value = "audioId", type = IdType.ASSIGN_UUID)
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
     * 小说主键
     */
    @TableField("novelId")
    private String novelId;

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
     * 音频是否完结
     */
    @TableField("audioWhetherEnd")
    private String audioWhetherEnd;

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
     * 音频演绎方式
     */
    @TableField("audioDeductionWay")
    private String audioDeductionWay;

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
     * 音频播放人
     */
    @TableField("audioAuthor")
    private String audioAuthor;

    /**
     * 是否存在小说
     */
    @TableField("whetherExistNovel")
    private String whetherExistNovel;

    /**
     * 音频排序方式
     */
    @TableField("audioSortType")
    private String audioSortType;

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
     * 音频总价格
     */
    @TableField("audioPrice")
    private Double audioPrice;


}
