package com.example.zmlmcore.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <p>
 * 音频内容与用户的购买关系
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("audiocontentmutualuser")
public class AudioContentMutualuser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 音频内容主键
     */
    @TableField("contentId")
    private String contentId;

    /**
     * 用户主键
     */
    @TableField("userId")
    private String userId;

    /**
     * 存在时间-代码项
     */
    @TableField("existTime")
    private String existTime;

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
