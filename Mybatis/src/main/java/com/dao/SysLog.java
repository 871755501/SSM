package com.dao;

import com.pojo.t_ivrmt_newtransferconfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysLog {

    List<t_ivrmt_newtransferconfig> findAllList( @Param("name") String name,@Param("ext1") String ext1);
}
