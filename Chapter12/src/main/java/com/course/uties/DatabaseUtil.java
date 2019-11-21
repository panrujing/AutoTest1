package com.course.uties;



import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DatabaseUtil {

    public static SqlSession getSqlSession() throws IOException {
        //获取配置的资源文件
        Reader reader = org.apache.ibatis.io.Resources.getResourceAsReader("databaseConfig.xml");
       //加载配置文件
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        //返回SqlSession 执行配置文件中的sql语句
        SqlSession  sqlSession = factory.openSession();
        return sqlSession;
    }
}
