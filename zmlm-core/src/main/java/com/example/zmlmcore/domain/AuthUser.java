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
 * 用户第三方认证表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("authuser")
public class AuthUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户认证主键
     */
    @TableId(value = "authUserId", type = IdType.ASSIGN_UUID)
    private String authUserId;

    /**
     * 用户主键
     */
    @TableField("userId")
    private String userId;

    /**
     * 认证方式
     */
    @TableField("authWay")
    private String authWay;

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
