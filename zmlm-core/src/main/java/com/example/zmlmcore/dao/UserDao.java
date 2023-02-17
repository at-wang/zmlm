package com.example.zmlmcore.dao;

import com.example.zmlmcore.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
