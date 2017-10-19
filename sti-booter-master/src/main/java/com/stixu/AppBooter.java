package com.stixu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

/**
 *
 * @author ganhuan
 */
@SpringBootApplication
@Import({ServiceConfigs.class, MvcConfigs.class})
public class AppBooter extends SpringBootServletInitializer {
    
    /**
	 * 添加自身的配置信息
     * @param application
     * @return 
	 */
        @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(AppBooter.class);
	}
        
    /**
	 * 启动应用程序
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AppBooter.class, args);
	}
}
