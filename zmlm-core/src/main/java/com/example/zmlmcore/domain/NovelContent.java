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
 * 小说内容表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("novelcontent")
public class NovelContent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 小说内容主键
     */
    @TableId(value = "novelContentId", type = IdType.ASSIGN_UUID)
    private String novelContentId;

    /**
     * 内容支付主键
     */
    @TableField("novelContentPayId")
    private String novelContentPayId;

    /**
     * 评论主键
     */
    @TableField("commentId")
    private String commentId;

    /**
     * 小说主键
     */
    @TableField("novelId")
    private String novelId;

    /**
     * 内容集数
     */
    @TableField("novelContentNumber")
    private Long novelContentNumber;

    /**
     * 播放量/集
     */
    @TableField("novelContentPlayCount")
    private Double novelContentPlayCount;

    /**
     * 内容购买方式-代码项
     */
    @TableField("novelContentBuyWay")
    private String novelContentBuyWay;

    /**
     * 名字/集
     */
    @TableField("novelContentName")
    private String novelContentName;

    /**
     * 多少秒钟/集
     */
    @TableField("novelContentLength")
    private String novelContentLength;

    /**
     * 小说价格/集
     */
    @TableField("novelContentPrice")
    private Double novelContentPrice;

    /**
     * 小说上一条链接
     */
    @TableField("novelContentPreviousAddress")
    private String novelContentPreviousAddress;

    /**
     * 小说地址
     */
    @TableField("novelContentAddress")
    private String novelContentAddress;

    /**
     * 小说下一条链接
     */
    @TableField("novelContentNextAddress")
    private String novelContentNextAddress;

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
