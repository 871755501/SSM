package com.dao;

import com.pojo.t_ivrmt_newtransferconfig;

import java.util.List;

public interface SysLogMapper {
//    @Select("select * from t_ivrmt_newtransferconfig")
    List<t_ivrmt_newtransferconfig> findAll();
//    @Select("select count(*) from t_ivrmt_newtransferconfig")
    int selectById();
}
