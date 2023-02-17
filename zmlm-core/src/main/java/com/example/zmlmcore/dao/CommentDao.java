package com.example.zmlmcore.dao;

import com.example.zmlmcore.domain.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 评论表 Mapper 接口
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Mapper
public interface CommentDao extends BaseMapper<Comment> {

}
