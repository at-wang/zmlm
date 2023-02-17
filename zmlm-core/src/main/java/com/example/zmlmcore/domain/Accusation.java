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
 * 举报表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("accusation")
public class Accusation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 举报主键
     */
    @TableId(value = "accusationId", type = IdType.ASSIGN_UUID)
    private String accusationId;

    /**
     * 举报人主键
     */
    @TableField("accusationUserId")
    private String accusationUserId;

    /**
     * 举报音频主键
     */
    @TableField("accusationAudioId")
    private String accusationAudioId;

    /**
     * 举报评论主键
     */
    @TableField("accusationCommentId")
    private String accusationCommentId;

    /**
     * 举报工会主键
     */
    @TableField("accusationTradeUnion")
    private String accusationTradeUnion;

    /**
     * 管理员主键
     */
    @TableField("adminId")
    private String adminId;

    /**
     * 举报原因
     */
    @TableField("accusationReason")
    private String accusationReason;

    /**
     * 举报图片
     */
    @TableField("accusationPhoto")
    private String accusationPhoto;

    /**
     * 举报日期
     */
    @TableField("accusationDate")
    private LocalDateTime accusationDate;

    /**
     * 举报处理内容
     */
    @TableField("accusationHandleContent")
    private String accusationHandleContent;

    /**
     * 举报处理结果-代码项
     */
    @TableField("accusationHandleResult")
    private String accusationHandleResult;

    /**
     * 举报处理人
     */
    @TableField("accusationHandlePeople")
    private String accusationHandlePeople;

    /**
     * 举报处理日期
     */
    @TableField("accusationHandleDate")
    private LocalDateTime accusationHandleDate;

    /**
     * 举报发起人主键
     */
    @TableField("accusationProposeUserId")
    private String accusationProposeUserId;


}
