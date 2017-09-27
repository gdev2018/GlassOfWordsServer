package org.gdev2018.glassofwords.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by RET on 2017-09-27.
 */

@Configuration
@EnableWebMvc
@ComponentScan("org.gdev2018.glassofwords.server")
public class WebConfig extends WebMvcConfigurerAdapter {

}

