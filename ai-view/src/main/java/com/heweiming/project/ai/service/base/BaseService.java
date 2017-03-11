package com.heweiming.project.ai.service.base;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

public interface BaseService<R, E> {

    long countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(Integer id);

    int insert(R record);

    int insertSelective(R record);

    List<R> selectByExampleWithRowbounds(E example, RowBounds rowBounds);

    List<R> selectByExample(E example);

    R selectByPrimaryKey(Integer id);

    int updateByExampleSelective(R record, E example);

    int updateByExample(R record, E example);

    int updateByPrimaryKeySelective(R record);

    int updateByPrimaryKey(R record);

}
