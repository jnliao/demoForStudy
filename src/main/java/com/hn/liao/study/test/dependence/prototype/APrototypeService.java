package com.hn.liao.study.test.dependence.prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jinneng.liao
 * 原型模式（prototype）属性注入循环依赖
 */
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class APrototypeService {
    @Resource
    private BPrototypeService bPrototypeService;
}
