package com.oracle.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // return RootConfig.class if you have application beans
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebAppConfig.class }; // Your Spring MVC config class
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // Map DispatcherServlet to handle all requests
    }
}
