package com.heliyijie;

import com.dao.SysLogMapper;
import com.pojo.t_ivrmt_newtransferconfig;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.apache.ibatis.io.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class TestBase {

    //    借助此对象创建SqlSession通过它实现与数据库的会话
    protected SqlSessionFactory faction;

    @Before
    public void init() throws IOException {
        InputStream in = Resources.getResourceAsStream("Mybatis-configs.xml");
        faction = new SqlSessionFactoryBuilder().build(in);
        System.out.println("获取SqlSessionFaction工厂对象"+faction);
    }

    @Test
    public void testSqlSessionConnection() {
        SqlSession session = faction.openSession();
//        Connection connection = session.getConnection();
//        System.out.println(connection);
        SysLogMapper mapper = session.getMapper(SysLogMapper.class);
//        List<t_ivrmt_newtransferconfig> list = mapper.findAll();
//        for (t_ivrmt_newtransferconfig l:list) {
//            System.out.println(l);
//        }
        Integer count = mapper.selectById();
        System.out.println(count);
        session.commit();
    }

}
