package com.lukasz.engineerproject.app4train.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableAutoConfiguration
@EnableWebSecurity
@ComponentScan({"com.lukasz.engineerproject"})
@EnableJpaRepositories({"com.lukasz.engineerproject"})
@EntityScan({"com.lukasz.engineerproject"})
public class SpringBootAppApplication extends SpringBootServletInitializer {
	
	public SpringBootAppApplication() {
	    super();
	    setRegisterErrorPageFilter(false); // <- this one
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootAppApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}
}