//package com.example.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.jdbc.datasource.init.DataSourceInitializer;
//import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
//
//@Configuration
//public class SQLConfiguration {
//	
//	 @Bean
//	 public DataSourceInitializer dataSourceInitializer() {
//	     ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
//	     resourceDatabasePopulator.addScript(new ClassPathResource("/data.sql"));
//
//	     DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
//	     dataSourceInitializer.setDataSource(dataSource());
//	     dataSourceInitializer.setDatabasePopulator(resourceDatabasePopulator);
//	     return dataSourceInitializer;
//	 }
//	
//
//}
