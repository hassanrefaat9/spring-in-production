package com.example.springinprod.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DBConnectionConfig {
    private DBConfiguration dbConfiguration;

    public DBConnectionConfig(DBConfiguration dbConfiguration) {
        this.dbConfiguration = dbConfiguration;
    }

    @Profile("dev")
    @Bean
    public String devDBConnection(){
        System.out.println("DB connection for DEV - H2");
        System.out.println(dbConfiguration.getDriverClassName());
        System.out.println(dbConfiguration.getUrl());
        System.out.println(dbConfiguration.getUsername());
        System.out.println(dbConfiguration.getPassword());
        return "DB connection to DEV - H2";
    }

    @Profile("qa")
    @Bean
    public String gavDBConnection(){
        System.out.println("BD connection for QA");
        System.out.println(dbConfiguration.getDriverClassName());
        System.out.println(dbConfiguration.getUrl());
        System.out.println(dbConfiguration.getUsername());
        System.out.println(dbConfiguration.getPassword());
        return "DB connection to QA ";
    }

    @Profile("prod")
    @Bean
    public String prodDBConnection(){
        System.out.println("DB connection for PROD");
        System.out.println(dbConfiguration.getDriverClassName());
        System.out.println(dbConfiguration.getUrl());
        System.out.println(dbConfiguration.getUsername());
        System.out.println(dbConfiguration.getPassword());
        return "DB connection to  PROD";
    }
}
