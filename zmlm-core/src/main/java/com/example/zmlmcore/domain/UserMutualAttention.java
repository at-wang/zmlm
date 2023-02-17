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
 * 用户粉丝关联表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("usermutualattention")
public class UserMutualAttention implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前用户主键
     */
    @TableField("userId")
    private String userId;

    /**
     * 粉丝主键
     */
    @TableField("userFanId")
    private String userFanId;

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
