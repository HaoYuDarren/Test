package com.yh.bootdemo.dao.mapper;

import com.yh.bootdemo.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Insert("insert into t_user (username,password) values (#{username},#{password}) ")
    public void insert(User user);

    public void update(User user);

    @Select("select * from t_user where id = #{id}")
    public User selectById(int id);

    @Delete("Delete from t_user where id = #{id}")
    public void deleteById(int id);

}
