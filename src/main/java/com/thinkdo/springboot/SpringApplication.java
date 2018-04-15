package com.thinkdo.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 部署到外部tomcat中时，需要该类继承SpringBootServletInitializer，而且将package设置成war,定义该类，
 * 然后执行mvn clean package -Dmaven.test.skip=true
 * @author Administrator
 *
 */
@SpringBootApplication
public class SpringApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringApplication.class);
	}
	
}
