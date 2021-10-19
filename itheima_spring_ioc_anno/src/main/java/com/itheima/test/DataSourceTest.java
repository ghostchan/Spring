package com.itheima.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;

public class DataSourceTest {

    @Test
    //测试手动创建druid数据源
    public void test2() throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mhl");
        dataSource.setUsername("root");
        dataSource.setPassword("root-123456");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    //测试手动创建c3p0数据源
    public void test1() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mhl");
        dataSource.setUser("root");
        dataSource.setPassword("root-123456");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
