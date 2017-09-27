package org.gdev2018.glassofwords.server;

import org.gdev2018.glassofwords.server.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by RET on 2017-09-27.
 */
public class AppInitializer implements WebApplicationInitializer {

    private final static String DISPATCHER = "dispatcher";

    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        // new Context
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        // register WebConfig in Context
        ctx.register(WebConfig.class);

        // Load Context to servletContext
        servletContext.addListener(new ContextLoaderListener(ctx));

        // add servletContext to Dispatcher of Servlets
        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER, new DispatcherServlet(ctx));

        // mapping servlet on definitely URL
        servlet.addMapping("/");

        // if here is more then 1 servlet, order of its Initialization
        servlet.setLoadOnStartup(1);
    }
}

