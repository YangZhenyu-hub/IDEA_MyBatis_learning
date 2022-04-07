package com.yzy.mybatis.mapper;

import com.yzy.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName SQLMapper
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-04 20:59
 * @Version
 **/
public interface SQLMapper {
    /**
     * 根据用户名模糊查询用户信息
     */
    List<User> getUserByLike(@Param("username") String username);

    /**
     * 批量删除
     */
    int deleteMore(@Param("ids") String ids);

    /**
     * 查询指定表中的数据
     */
    List<User> getUserByTableName(@Param("tableName") String tableName);

    /**
     * 添加用户信息
     */
    void insertUser(User user);
}
