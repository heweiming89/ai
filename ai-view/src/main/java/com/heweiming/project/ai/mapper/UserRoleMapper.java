package com.heweiming.project.ai.mapper;

import com.heweiming.project.ai.mapper.base.BaseMapper;
import com.heweiming.project.ai.model.UserRole;
import com.heweiming.project.ai.model.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserRoleMapper extends BaseMapper<UserRole, UserRoleExample> {
    long countByExample(UserRoleExample example);

    int deleteByExample(UserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExampleWithRowbounds(UserRoleExample example, RowBounds rowBounds);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRole record,
            @Param("example") UserRoleExample example);

    int updateByExample(@Param("record") UserRole record,
            @Param("example") UserRoleExample example);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}