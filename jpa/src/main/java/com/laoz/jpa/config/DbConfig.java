package com.laoz.jpa.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author: laoz
 * @Time: 2022/7/29  10:57
 * @description:
 */

@Configuration
public class DbConfig {

    @NacosValue(value = "${spring.datasource.driver-class-name}")
    String driverClass;

    @NacosValue(value = "${spring.datasource.url}")
    String url;

    @NacosValue(value = "${spring.datasource.username}")
    String userName;

    @NacosValue(value = "${spring.datasource.password}")
    String passWord;

    @NacosValue(value = "${spring.jpa.database}")
    String database;

    @NacosValue(value = "${spring.jpa.database-platform}")
    String databasePlatform;

    @NacosValue(value = "${spring.jpa.show-sql}")
    String showSql;

    @NacosValue(value = "${spring.jpa.format-sql}")
    String formatSql;

    @NacosValue(value = "${spring.jpa.hibernate.ddl-auto}")
    String ddlAuto;


    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername( userName );
        dataSource.setPassword( passWord );
        return dataSource;
    }

}


