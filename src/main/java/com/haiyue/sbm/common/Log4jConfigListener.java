package com.haiyue.sbm.common;

import com.haiyue.sbm.util.Log;
import org.apache.log4j.PropertyConfigurator;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Log4jConfigListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        String propertiesPath = Log4jConfigListener.class.getResource("/").getPath() + "log4j-spring.properties";
        System.out.println("Initializing log4j from [" + propertiesPath + "]");
        Properties properties = new Properties();
        File propertiesFile = new File(propertiesPath);
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(propertiesFile));
            properties.load(in);
            in.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // 根据环境变量JAVA_EVN来区分测试和正式服务器,分别加载不同的配置
        String localRootLogger = properties.getProperty("log4j.rootLogger");
        properties.setProperty("log4j.rootLogger", localRootLogger);
        PropertyConfigurator.configure(properties);
        Log.info("localRootLogger:" + localRootLogger);
    }

    public void contextDestroyed(ServletContextEvent sce) {
    }
}