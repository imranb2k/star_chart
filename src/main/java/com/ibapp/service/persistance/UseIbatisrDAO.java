/*
package com.ibapp.service.persistance;

import com.ibapp.domain.model.User;
import org.apache.ibatis.annotations.*;

public interface UserDAO {

    String INSERT_USER = "insert into " +
            "star_chart.user_acc (name, age, date_created) " +
            "values (#{name}, #{age}, #{dateCreated}) returning id";
    String SELECT_USER_BY_ID = "select * from star_chart.user_acc where id = #{id}";
    String DELETE_ALL = "delete from star_chart.user_acc";
    String UPDATE_USER = "update star_chart.user_acc set name=#{name}, age=#{age}, date_created=#{dateCreated} where id=#{id}";

    @Select(value = INSERT_USER)
    @Options(flushCache = true)
    long create(User user);

    @Select(SELECT_USER_BY_ID)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "dateCreated", column = "date_created")
    })
    User findById(Long id);

    @Delete(DELETE_ALL)
    void deleteAll();

    @Update(UPDATE_USER)
    void update(User user);
}
*/
