package com.yilu.oneroadweb.Dao;

import com.yilu.oneroadweb.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface UserMapper {
    @Insert("insert into user(username,password) values (#{username},#{password})")
    public void set(User user);
    @Select("select * from user where username = #{username} and password = #{password}")
    public User get(User user);

}
