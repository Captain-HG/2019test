package com.lzc.vuetest.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface IBaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
