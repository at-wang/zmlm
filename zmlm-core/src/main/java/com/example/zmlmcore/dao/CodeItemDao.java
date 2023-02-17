package com.example.zmlmcore.dao;

import com.example.zmlmcore.domain.CodeTtem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 代码项表 Mapper 接口
 * </p>
 *
 * @author shen
 * @since 2023-02-17
 */
@Mapper
public interface CodeItemDao extends BaseMapper<CodeTtem> {

}
