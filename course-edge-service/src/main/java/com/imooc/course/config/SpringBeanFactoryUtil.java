package com.imooc.course.config;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanFactoryUtil implements ApplicationContextAware {

    private static ApplicationContext context = null;

    public static <T> T getBean(String name, Class<T> type) {
        return context.getBean(name, type);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringBeanFactoryUtil.context == null) {
            SpringBeanFactoryUtil.context = applicationContext;
        }
    }
}