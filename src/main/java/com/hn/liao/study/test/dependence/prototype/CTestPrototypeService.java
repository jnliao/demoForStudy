package com.hn.liao.study.test.dependence.prototype;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jinneng.liao
 * 使用时报错
 */
@Service
public class CTestPrototypeService {
    //@Resource
    private APrototypeService aPrototypeService;
}
