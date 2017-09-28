package org.gdev2018.glassofwords.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * Created by RET on 2017-09-28.
 */
@Configuration
@EnableJpaRepositories ("org.gdev2018.glassofwords.server.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("org.gdev2018.glassofwords.server")
public class DatabaseConfig {

    @Resource       // annotation for inject object
    private Environment env;    // lets us to take values from properties file


}
