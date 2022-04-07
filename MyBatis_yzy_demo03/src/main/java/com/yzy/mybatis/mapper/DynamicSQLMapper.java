package com.yzy.mybatis.mapper;

import com.yzy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName DynamicSQLMapper
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-06 10:16
 * @Version
 **/
public interface DynamicSQLMapper {
    /**
     * 多条件查询
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:17 2022/4/6
     * @param emp
     * @return java.util.List<com.yzy.mybatis.pojo.Emp>
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 测试choose、when、otherwise
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:20 2022/4/6
     * @param emp
     * @return java.util.List<com.yzy.mybatis.pojo.Emp>
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 通过数组实现批量删除
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:22 2022/4/6
     * @param eids
     * @return int
     */
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    /**
     * 通过List实现批量添加
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 10:22 2022/4/6
     * @param eids
     * @return int
     */
    int insertMoreByList(@Param("eids") List eids);
}
