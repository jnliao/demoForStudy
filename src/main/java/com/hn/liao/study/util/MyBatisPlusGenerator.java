package com.hn.liao.study.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * mybatis-plus代码生成器(用于生成entity)<br>
 * @author liaojinneng
 */
public class MyBatisPlusGenerator {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //这里写你自己的java目录
        gc.setOutputDir("/IT/generatorCode");
        //是否覆盖
        gc.setFileOverride(true);
        gc.setActiveRecord(false);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(true);
        gc.setAuthor("liaojinneng");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                if ("tinyint(1)".equals(fieldType)) {
                    return DbColumnType.BOOLEAN;
                }
                return super.processTypeConvert(fieldType);
            }

        });
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 此处可以修改为您的表前缀
        strategy.setTablePrefix(new String[]{"_"});
        //移除domain中boolean类型前面的is
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);
        //设置包含的表名
        strategy.setInclude(new String[]{"test_user"});
        //使用lombook方式生成set、get
        strategy.setEntityLombokModel(true);
        strategy.setNaming(NamingStrategy.underline_to_camel); //f 表名生成策略
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(null);
        pc.setEntity("com.test.domain");
        pc.setMapper("com.test.mapper");
        pc.setXml("com.test.mapper.mapping");
        pc.setService("com.test.service");
        pc.setServiceImpl("com.test.service.impl");
        pc.setController("com.test.endpoint");
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        mpg.setCfg(cfg);

        // 执行生成
        mpg.execute();

        // 打印注入设置
        System.err.println(mpg.getCfg().getMap().get("abc"));
    }
}