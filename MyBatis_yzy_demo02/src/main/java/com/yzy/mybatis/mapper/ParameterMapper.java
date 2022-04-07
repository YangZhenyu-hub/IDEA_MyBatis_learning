package com.yzy.mybatis.mapper;

import com.yzy.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ParameterMapper
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-03 20:05
 * @Version
 **/
public interface ParameterMapper {

    /**
     * 获取所有用户
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 20:14 2022/4/3
     * @param
     * @return java.util.List<com.yzy.mybatis.pojo.User>
     */
    List<User> getAllUsers();

    /**
     * 根据用户名查询用户信息
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:12 2022/4/4
     * @param username
     * @return com.yzy.mybatis.pojo.User
     */
    User getUserByUsername(String username);

    /**
     * 验证登录
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:13 2022/4/4
     * @param username
     * @param password
     * @return com.yzy.mybatis.pojo.User
     */
    User checkLogin(String username,String password);

    /**
     * 验证登录，参数为Map
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:15 2022/4/4
     * @param map
     * @return com.yzy.mybatis.pojo.User
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 添加用户信息
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:18 2022/4/4
     * @param user
     * @return int
     */
    int insertUser(User user);

    /**
     * 验证登录（使用Param）
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:19 2022/4/4
     * @param username
     * @param password
     * @return com.yzy.mybatis.pojo.User
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
