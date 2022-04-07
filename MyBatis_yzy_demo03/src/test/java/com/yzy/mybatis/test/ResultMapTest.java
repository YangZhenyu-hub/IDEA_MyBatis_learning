package com.yzy.mybatis.test;

import com.yzy.mybatis.mapper.DeptMapper;
import com.yzy.mybatis.mapper.EmpMapper;
import com.yzy.mybatis.pojo.Dept;
import com.yzy.mybatis.pojo.Emp;
import com.yzy.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName ResultMapTest
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-05 10:53
 * @Version
 **/
public class ResultMapTest {

    /**
     * 解决字段名和属性名不一致的情况：
     * a>为字段起别名，保持和属性名的一致
     * b>设置全局配置，将_自动映射为驼峰
     * <setting name="mapUnderscoreToCamelCase" value="true"/>
     * c>通过resultMap设置自定义的映射关系
     * <resultMap id="empResultMap" type="Emp">
     *     <id property="eid" column="eid"></id>
     *     <result property="empName" column="emp_name"></result>
     *     <result property="age" column="age"></result>
     *     <result property="sex" column="sex"></result>
     *     <result property="email" column="email"></result>
     * </resultMap>
     *
     * 处理多对一的映射关系：
     * a>级联属性赋值
     * b>association
     * c>分步查询
     *
     * 处理一对多的映射关系
     * a>collection
     * b>分步查询
     */
    @Test
    public void testGetAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        allEmp.forEach(System.out::println);
    }
    @Test
    public void testGetAllEmpAutoUnderscoreToCamelCase() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmpAutoUnderscoreToCamelCase();
        allEmp.forEach(System.out::println);
    }

    @Test
    public void testgetAllEmpByResultMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> list = mapper.getAllEmpByResultMap();
        list.forEach(System.out::println);
    }

    /**
     * 多对一 ：级联属性赋值
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 16:44 2022/4/5
     * @param
     * @return void
     */
    @Test
    public void testgetEmpAndDeptByMapOne() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(1);
        System.out.println(emp);
    }

    @Test
    public void testGetEmpAndDeptByStepOne() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(3);
        System.out.println(emp);
    }

    @Test
    public void testGetDeptAndEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmp(1);
        System.out.println(dept);
    }

    @Test
    public void testGetDeptAndEmpByStep(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(dept.getDeptName());
    }

}
