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
 * 用户历史音频表
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("userhistoryaudio")
public class UserHistoryAudio implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户历史音频主键
     */
    @TableId(value = "userHistoryAudioId", type = IdType.ASSIGN_UUID)
    private String userHistoryAudioId;

    /**
     * 用户主键
     */
    @TableField("userId")
    private String userId;

    /**
     * 音频主键
     */
    @TableField("audioId")
    private String audioId;

    /**
     * 是否有效
     */
    @TableField("whetherEffective")
    private String whetherEffective;

    /**
     * 播放集数
     */
    @TableField("playNumber")
    private Integer playNumber;

    /**
     * 播放秒数
     */
    @TableField("playTime")
    private Integer playTime;

    /**
     * 最近播放日期
     */
    @TableField("playDate")
    private LocalDateTime playDate;

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
