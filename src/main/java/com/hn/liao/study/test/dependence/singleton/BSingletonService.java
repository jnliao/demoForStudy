package com.hn.liao.study.test.dependence.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jinneng.liao
 */
@Service
public class BSingletonService {

    @Resource
    private ASingletonService aSingletonService;

}
