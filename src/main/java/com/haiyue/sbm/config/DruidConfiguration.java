package com.haiyue.sbm.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.haiyue.sbm.model.yml.DruidConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ Created by liuhaiming on 2016/10/18.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("com.haiyue.sbm.model.yml")
public class DruidConfiguration {

    @Autowired
    private DruidConfig druidConfig;

    @Bean
    @Primary //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(druidConfig.getDriverClassName());
        druidDataSource.setUrl(druidConfig.getUrl());
        druidDataSource.setUsername(druidConfig.getUsername());
        druidDataSource.setPassword(druidConfig.getPassword());
        druidDataSource.setInitialSize(druidConfig.getInitialSize());
        druidDataSource.setMinIdle(druidConfig.getMinIdle());
        druidDataSource.setMaxActive(druidConfig.getMaxActive());
        druidDataSource.setMaxWait(druidConfig.getMaxWait());
        druidDataSource.setTimeBetweenEvictionRunsMillis(druidConfig.getTimeBetweenEvictionRunsMillis());
        druidDataSource.setMinEvictableIdleTimeMillis(druidConfig.getMinEvictableIdleTimeMillis());
        druidDataSource.setValidationQuery(druidConfig.getValidationQuery());
        druidDataSource.setTestWhileIdle(druidConfig.getTestWhileIdle());
        druidDataSource.setTestOnBorrow(druidConfig.getTestOnBorrow());
        druidDataSource.setTestOnReturn(druidConfig.getTestOnReturn());
        druidDataSource.setPoolPreparedStatements(druidConfig.getPoolPreparedStatements());
        Properties properties = new Properties();
        properties.setProperty("druid.stat.mergeSql", druidConfig.getConnectionProperties().get("mergeSql"));
        properties.setProperty("druid.stat.slowSqlMillis", druidConfig.getConnectionProperties().get("slowSqlMillis"));
        druidDataSource.setConnectProperties(properties);
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(druidConfig
                .getMaxPoolPreparedStatementPerConnectionSize());
        try {
            druidDataSource.setFilters(druidConfig.getFilters());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return druidDataSource;
    }


}
