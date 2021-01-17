package com.hn.liao.study.test.dependence.construct;

import org.springframework.stereotype.Service;

/**
 * @author jinneng.liao
 * 构造器注入循环依赖(circular reference)
 */
//@Service
public class AConstructService {

    public AConstructService(BConstructService bConstructService){}
}
