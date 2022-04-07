package com.yzy.mybatis.mapper;

import com.yzy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName EmpMapper
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-05 10:34
 * @Version
 **/
public interface EmpMapper {
    /**
     * 查询所有员工的信息
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:39 2022/4/5
     * @param
     * @return java.util.List<com.yzy.mybatis.pojo.Emp>
     */
    List<Emp> getAllEmp();

    /**
     * _自动映射为驼峰
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 11:13 2022/4/5
     * @param
     * @return java.util.List<com.yzy.mybatis.pojo.Emp>
     */
    List<Emp> getAllEmpAutoUnderscoreToCamelCase();

    /**
     * 通过resultMap进行结果映射
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 11:21 2022/4/5
     * @param
     * @return java.util.List<com.yzy.mybatis.pojo.Emp>
     */
    List<Emp> getAllEmpByResultMap();

    /**
     * 查询指定员工的部门信息
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 16:10 2022/4/5
     * @param eid
     * @return com.yzy.mybatis.pojo.Emp
     */
    Emp getEmpAndDept(@Param("eid") Integer eid);

    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    /**
     * 通过分步查询查询部门以及部门中所有的员工信息
     * 分步查询第二步：根据did查询员工信息
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);
}
