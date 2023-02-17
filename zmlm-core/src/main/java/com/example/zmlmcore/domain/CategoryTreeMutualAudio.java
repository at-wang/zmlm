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
 * 种类树和音频关系表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("categorytreemutualaudio")
public class CategoryTreeMutualAudio implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 种类树内部类型
     */
    @TableField("categoryInsideType")
    private String categoryInsideType;

    /**
     * 音频主键
     */
    @TableField("audioId")
    private String audioId;

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
