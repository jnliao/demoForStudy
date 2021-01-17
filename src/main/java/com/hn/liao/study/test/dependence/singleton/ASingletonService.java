package com.hn.liao.study.test.dependence.singleton;

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
}
