package com.example.zmlmcore.dao;

import com.example.zmlmcore.domain.AuthUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户第三方认证表 Mapper 接口
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Mapper
public interface AuthUserDao extends BaseMapper<AuthUser> {

}
