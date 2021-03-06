/**
 * Copyright(c) 2011-2017 by  Inc. All Rights Reserved
 */
package net.loyintean.blog.serversentevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Snoopy
 * @since 2017年8月1日
 */
@SpringBootApplication
@EnableScheduling
public class ServerSentEventApplication extends SpringBootServletInitializer {

    /**
     * 内置tomcat的初始化
     *
     * @param args
     * @author Snoopy
     * @since 2017年6月20日
     */
    public static void main(String[] args) {
        SpringApplication.run(ServerSentEventApplication.class, args);
    }

    /**
     * 外置tomcat的初始化
     *
     * @param application
     * @return
     * @author Snoopy
     * @since 2017年7月3日
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder
                                                             application) {
        return application.sources(ServerSentEventApplication.class);
    }
}
