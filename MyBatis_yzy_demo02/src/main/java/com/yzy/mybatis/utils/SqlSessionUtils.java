package com.yzy.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName SqlSessionUtils
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-03 20:16
 * @Version
 **/
public class SqlSessionUtils {
    public static SqlSession getSqlSession() {
        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            sqlSession = sqlSessionFactory.openSession();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
}
