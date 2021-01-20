package com.hn.liao.study.test.dependence;

import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;

/**
 * @author jinneng.liao
 */
public class TestClass {

    public static void main(String[] args) {
        // 获取bean的类
        // org.springframework.beans.factory.support.AbstractBeanFactory.getBean(java.lang.String)
        //AbstractBeanFactory;

        // 创建bean的方法
        //AbstractBeanFactory.createBean()
        //org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean


        // 解决单例属性注入循环依赖的重要方法
        // new DefaultSingletonBeanRegistry().getSingleton("");
    }
}
