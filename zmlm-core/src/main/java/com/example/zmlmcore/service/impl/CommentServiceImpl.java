package com.example.zmlmcore.service.impl;

import com.example.zmlmcore.domain.Comment;
import com.example.zmlmcore.dao.CommentDao;
import com.example.zmlmcore.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentDao, Comment> implements CommentService {

}
