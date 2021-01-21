package com.hn.liao.study.test.dependence.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jinneng.liao
 * 单例模式属性注入循环依赖
 */
@Service
public class ASingletonService {

    @Resource
    private BSingletonService bSingletonService;

    //@Async
    public void test(){
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }
}
