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
 * 评论表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论主键
     */
    @TableId(value = "commentId", type = IdType.ASSIGN_UUID)
    private String commentId;

    /**
     * 用户主键
     */
    @TableField("userId")
    private String userId;

    /**
     * 评论父主键
     */
    @TableField("commentParentId")
    private String commentParentId;

    /**
     * 评论日期
     */
    @TableField("commentDate")
    private LocalDateTime commentDate;

    /**
     * 评分
     */
    @TableField("commentScore")
    private Integer commentScore;

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
