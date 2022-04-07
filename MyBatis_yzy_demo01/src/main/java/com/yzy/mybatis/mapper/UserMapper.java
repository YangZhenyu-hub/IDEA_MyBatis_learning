package com.yzy.mybatis.mapper;

import com.yzy.mybatis.pojo.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-03 10:24
 * @Version
 **/
public interface UserMapper {

    /**
     * MyBatis面向接口编程的两个一致：
     * 1、映射文件的namespace与Mapper接口的全类名保持一致
     * 2、映射文件中sql语句的id要和Mapper接口中的方法名保持一致
     *
     * 表--实体类--Mapper接口--映射文件
     */

    /**
     * 添加用户信息
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:36 2022/4/3
     * @param
     * @return int
     */
    int insertUser();

    /**
     * 修改用户信息
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 11:03 2022/4/3
     * @param
     * @return void
     */
    void updateUser();

    /**
     * 删除用户
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 11:04 2022/4/3
     * @param
     * @return int
     */
    void deleteUser();

    /**
     * 根据Id查询指定用户
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 14:51 2022/4/3
     * @param
     * @return com.yzy.mybatis.pojo.User
     */
    User getUserById();

    /**
     * 查询所有的用户
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 14:51 2022/4/3
     * @param
     * @return java.util.List<com.yzy.mybatis.pojo.User>
     */
    List<User> getAllUsers();
}
