package com.burt.dao;

import com.burt.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author burt
 */
@Mapper
public interface UserDao {

    User selectByPrimaryKey(Long id);

}