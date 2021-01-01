package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages=("com.spring"))
public class Myconfig {
	
	
	@Bean
	 public ViewResolver resolver()
	 {
		 InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		 internalResourceViewResolver.setViewClass(JstlView.class);
		 internalResourceViewResolver.setPrefix("/WEB-INF/view");
		 internalResourceViewResolver.setSuffix(".jsp");
		 
		 
		return internalResourceViewResolver;
		 
	 }

}
