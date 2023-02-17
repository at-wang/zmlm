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
 * 小说表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("novel")
public class Novel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 小说主键
     */
    @TableId(value = "novelId", type = IdType.ASSIGN_UUID)
    private String novelId;

    /**
     * 小说上传用户主键
     */
    @TableField("novelUploadUserId")
    private String novelUploadUserId;

    /**
     * 小说订阅用户主键
     */
    @TableField("novelSubscribeUserId")
    private String novelSubscribeUserId;

    /**
     * 小说封面地址
     */
    @TableField("novelCover")
    private String novelCover;

    /**
     * 小说是否免费-代码项
     */
    @TableField("novelWhetherFree")
    private String novelWhetherFree;

    /**
     * 小说是否vip免费-代码项
     */
    @TableField("novelWhetherVipFree")
    private String novelWhetherVipFree;

    /**
     * 小说是否完结
     */
    @TableField("novelWhetherEnd")
    private String novelWhetherEnd;

    /**
     * 小说播放量
     */
    @TableField("novelPlayCount")
    private Double novelPlayCount;

    /**
     * 小说评分
     */
    @TableField("novelScore")
    private Double novelScore;

    /**
     * 小说名字
     */
    @TableField("novelName")
    private String novelName;

    /**
     * 小说简介
     */
    @TableField("novelBlurb")
    private String novelBlurb;

    /**
     * 小说演绎方式
     */
    @TableField("novelDeductionWay")
    private String novelDeductionWay;

    /**
     * 小说推荐等级-代码行
     */
    @TableField("novelSuggestLevel")
    private String novelSuggestLevel;

    /**
     * 小说点击量
     */
    @TableField("novelClickCount")
    private Integer novelClickCount;

    /**
     * 小说播放人
     */
    @TableField("novelAuthor")
    private String novelAuthor;

    /**
     * 是否存在小说
     */
    @TableField("whetherExistNovel")
    private String whetherExistNovel;

    /**
     * 小说排序方式
     */
    @TableField("novelSortType")
    private String novelSortType;

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
     * 小说总价格
     */
    @TableField("novelPrice")
    private Double novelPrice;


}
