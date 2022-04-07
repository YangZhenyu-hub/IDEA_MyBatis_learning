package com.yzy.mybatis.mapper;

import com.yzy.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName CachMapper
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-06 11:15
 * @Version
 **/
public interface CacheMapper {
    Emp getEmpByEid(@Param("eid") Integer eid);

    void insertEmp(Emp emp);
}
