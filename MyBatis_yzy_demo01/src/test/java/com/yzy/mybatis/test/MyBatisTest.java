package com.yzy.mybatis.test;

import com.yzy.mybatis.mapper.UserMapper;
import com.yzy.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName MyBatisTest
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-03 11:08
 * @Version
 **/
public class MyBatisTest {
    @Test
    public void testInsert() throws IOException {
        //读取MyBatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件对应的字节输入流创建工厂类SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //根据sqlSessionFactory得到sqlSession对象
        //Session对象代表Java程序与数据库之间的会话（如，HttpSession是Java程序与浏览器之间的会话）
        //此时sqlSession都必须手动提交事务或者回滚
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //此时自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过代理模式创建UserMapper接口的实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.insertUser();
        sqlSession.commit();
        is.close();
    }

    @Test
    public void testUpdate() throws IOException {
        //读取MyBatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件对应的字节输入流创建工厂类SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //根据sqlSessionFactory得到sqlSession对象
        //Session对象代表Java程序与数据库之间的会话（如，HttpSession是Java程序与浏览器之间的会话）
        //此时sqlSession都必须手动提交事务或者回滚
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //此时自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过代理模式创建UserMapper接口的实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.commit();
        is.close();
    }

    @Test
    public void testDelete() throws IOException {
        //读取MyBatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件对应的字节输入流创建工厂类SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //根据sqlSessionFactory得到sqlSession对象
        //Session对象代表Java程序与数据库之间的会话（如，HttpSession是Java程序与浏览器之间的会话）
        //此时sqlSession都必须手动提交事务或者回滚
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //此时自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过代理模式创建UserMapper接口的实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.commit();
        is.close();
    }

    @Test
    public void testSelect() throws IOException {
        //读取MyBatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件对应的字节输入流创建工厂类SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //根据sqlSessionFactory得到sqlSession对象
        //Session对象代表Java程序与数据库之间的会话（如，HttpSession是Java程序与浏览器之间的会话）
        //此时sqlSession都必须手动提交事务或者回滚
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //此时自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过代理模式创建UserMapper接口的实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
        is.close();
    }

    @Test
    public void testSelectList() throws IOException {
        //读取MyBatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件对应的字节输入流创建工厂类SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //根据sqlSessionFactory得到sqlSession对象
        //Session对象代表Java程序与数据库之间的会话（如，HttpSession是Java程序与浏览器之间的会话）
        //此时sqlSession都必须手动提交事务或者回滚
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //此时自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过代理模式创建UserMapper接口的实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getAllUsers();
        for (User each : users) {
            System.out.println(each);
        }
        is.close();
    }

}
