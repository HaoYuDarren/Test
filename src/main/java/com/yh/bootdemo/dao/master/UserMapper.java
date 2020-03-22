package com.yh.bootdemo.dao.master;

import com.yh.bootdemo.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Results(id = "userMap",value = {
            @Result(property = "id",column = "id",id = true)
    })

    public int insert(User user);

    public void update(User user);



    @Delete("Delete from user where id = #{id}")
    public void deleteById(int id);

}
