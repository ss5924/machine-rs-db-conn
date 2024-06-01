//package me.songha.machiners.config;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourceConfig {
//
//    @Bean
//    public DataSource dataSource() {
//        HikariConfig hikariConfig = new HikariConfig();
//        hikariConfig.setDriverClassName("org.mariadb.jdbc.Driver");
//        hikariConfig.setJdbcUrl("jdbc:mariadb://192.168.0.37:3306/term_project");
//        hikariConfig.setUsername("root");
//        hikariConfig.setPassword("1234");
//
//        HikariDataSource dataSource = new HikariDataSource(hikariConfig);
//        return dataSource;
//    }
//
//}
