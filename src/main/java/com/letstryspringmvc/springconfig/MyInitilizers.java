package com.letstryspringmvc.springconfig;

import com.letstryspringmvc.functions.Expression;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyInitilizers extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Expression.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
