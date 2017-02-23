package com.base;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages="com")
@EnableElasticsearchRepositories(basePackages = {"com.dao"}) 
public class Application implements CommandLineRunner{
	public static ConfigurableApplicationContext ctx;
    public static void main(String[] args) {
    	ctx=SpringApplication.run(Application.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}