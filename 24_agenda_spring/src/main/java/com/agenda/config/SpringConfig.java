package com.agenda.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@ComponentScan(basePackages = {"com.agenda.repository","com.agenda.service"})
@Configuration
public class SpringConfig {
		
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource data=new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/agenda");
		data.setUsername("root");
		data.setPassword("root");
		return data;
	}
		
	@Bean 
	public JdbcTemplate getTemplate(DataSource datasource) {
		return new JdbcTemplate(datasource);
	}
}
