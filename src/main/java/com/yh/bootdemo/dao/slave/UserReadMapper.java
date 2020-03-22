package com.yh.bootdemo.dao.slave;

import com.yh.bootdemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserReadMapper {

    @Select("select * from user where id = #{id}")
    public User selectById(int id);

    @Select("update user  set  where id = #{id}")
    public User update(int id);
}
