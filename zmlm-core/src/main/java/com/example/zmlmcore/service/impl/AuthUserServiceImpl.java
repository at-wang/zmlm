package com.example.zmlmcore.service.impl;

import com.example.zmlmcore.domain.AuthUser;
import com.example.zmlmcore.dao.AuthUserDao;
import com.example.zmlmcore.service.AuthUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户第三方认证表 服务实现类
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Service
public class AuthUserServiceImpl extends ServiceImpl<AuthUserDao, AuthUser> implements AuthUserService {

}
