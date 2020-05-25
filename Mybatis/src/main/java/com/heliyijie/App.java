package com.heliyijie;

import com.dao.SysLog;
import com.pojo.t_ivrmt_newtransferconfig;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws IOException {

        InputStream in = Resources.getResourceAsStream("Mybatis-configs.xml");
        SqlSessionFactory faction = new SqlSessionFactoryBuilder().build(in);
//        System.out.println("获取SqlSessionFaction工厂对象"+faction);
        SqlSession session = faction.openSession();
        SysLog mapper = session.getMapper(SysLog.class);
        List<t_ivrmt_newtransferconfig> list = mapper.findAllList("T351_HKPackage", "0766");
        System.out.println(list.size());
//        SysLogMapper mapper1 = session.getMapper(SysLogMapper.class);
//        mapper1.findAll();
//        List<t_ivrmt_newtransferconfig> list = mapper1.findAll();
//        for (t_ivrmt_newtransferconfig li : list
//                ) {
//            System.out.println(li);
//        }
        session.commit();
    }
}
