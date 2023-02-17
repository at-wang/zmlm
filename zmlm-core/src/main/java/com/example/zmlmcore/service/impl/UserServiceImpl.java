package com.example.zmlmcore.service.impl;

import com.example.zmlmcore.domain.User;
import com.example.zmlmcore.dao.UserDao;
import com.example.zmlmcore.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
