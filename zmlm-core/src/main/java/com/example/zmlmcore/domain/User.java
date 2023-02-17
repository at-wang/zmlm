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
 * 用户表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 个人主键
     */
    @TableId(value = "userId", type = IdType.ASSIGN_UUID)
    private String userId;

    /**
     * 用户姓名
     */
    @TableField("userName")
    private String userName;

    /**
     * 用户密码
     */
    @TableField("userPassword")
    private String userPassword;

    /**
     * 用户手机
     */
    @TableField("userPhone")
    private String userPhone;

    /**
     * 用户级别-代码项
     */
    @TableField("userLevel")
    private String userLevel;

    /**
     * 用户头像
     */
    @TableField("userPhoto")
    private String userPhoto;

    /**
     * 用户是否为vip-代码项
     */
    @TableField("userWhetherVip")
    private String userWhetherVip;

    /**
     * 用户账号
     */
    @TableField("userAccount")
    private String userAccount;

    /**
     * 工会主键
     */
    @TableField("tradeUnionId")
    private String tradeUnionId;

    /**
     * 是否存在工会
     */
    @TableField("whetherExistTradeUnion")
    private String whetherExistTradeUnion;

    /**
     * 用户是否是主播
     */
    @TableField("userWhetherAnchor")
    private String userWhetherAnchor;

    /**
     * 用户是否有效
     */
    @TableField("whetherEffective")
    private String whetherEffective;

    /**
     * 用户花费金额
     */
    @TableField("userPayMoney")
    private Double userPayMoney;

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
