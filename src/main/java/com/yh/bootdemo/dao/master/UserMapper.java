package com.yh.bootdemo.dao.master;

import com.yh.bootdemo.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Insert("insert into user (username,password) values (#{username},#{password}) ")
    public void insert(User user);

    public void update(User user);



    @Delete("Delete from user where id = #{id}")
    public void deleteById(int id);

}
