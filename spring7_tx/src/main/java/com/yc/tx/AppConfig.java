package com.yc.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan(basePackages = {"com.yc"})
public class AppConfig {
    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        DataSource ds=new ComboPooledDataSource();
        ((ComboPooledDataSource)ds).setDriverClass("com.mysql.jobc.Driver");
    }
}
