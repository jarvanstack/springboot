package com.example.sb22;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

import static com.baomidou.mybatisplus.generator.config.rules.DateType.ONLY_DATE;

/**
 * @Author Jarvan
 * @create 2020/8/7 20:32
 */
public class Test01 {
    public static void main(String[] args) {
        //代码自动生成器的唯一对象
        AutoGenerator autoGenerator = new AutoGenerator();


        //1.配置全局配置 GlobalConfig
        GlobalConfig globalConfig = new GlobalConfig();
        //获取模块路径，并到此模块java文件夹
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/sb-22-炒鸡重点代码生成器-起飞/src/main/java");
        //设置作者会自动生成到注释里
        globalConfig.setAuthor("嘉文");
        //生成代码后打开文件夹，我们关闭这个选择
        globalConfig.setOpen(true);
        //覆盖
        globalConfig.setFileOverride(false);
        //去掉service前缀 I
        globalConfig.setServiceName("%sService");
        //设置id自增注解
        globalConfig.setIdType(IdType.AUTO);
        //设置时间类型是java.util.Date 看源码一共有3种选择
        globalConfig.setDateType(ONLY_DATE);
        //自动生成Swagger 接口文档，false,我们先关闭
        globalConfig.setSwagger2(false);
        //将全局配置添加到对象中
        autoGenerator.setGlobalConfig(globalConfig);

        //2.数据库源 配置 DataSourceConfig
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/mybatis?useUnicode=true&useSSL=false&characterEncoding=utf8");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("612001");
        //设置数据源类型mysql
        dataSourceConfig.setDbType(DbType.MYSQL);

        //将数据源配置添加到 自动配置中
        autoGenerator.setDataSource(dataSourceConfig);

        //3.包的配置
        PackageConfig packageConfig = new PackageConfig();
        //父包模块名 就是 类似sb22/文件夹 父模板包的名
        packageConfig.setModuleName("test01");
        //父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
        packageConfig.setParent("com.bmft");
        //Entity包名 实体类 包名
        packageConfig.setEntity("pojo");
        //mapper包名
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setController("controller");
        //将包的配置添加到auto
        autoGenerator.setPackageInfo(packageConfig);


        //4.策略配置
        StrategyConfig strategyConfig = new StrategyConfig();

        //映射的表名
        strategyConfig.setInclude("user");
        //数据库表table名 映射到实体的命名策略 选择下划线转驼峰
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        //     * 数据库表字段column 【字段】映射到实体的命名策略
        //     * <p>未指定按照 naming 执行</p>
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        //自动lombok
        strategyConfig.setEntityLombokModel(true);
        //设置逻辑删除的字段名称 deleted
        strategyConfig.setLogicDeleteFieldName("deleted");
        //4.1 自动填充配置
        TableFill create_time = new TableFill("create_time", FieldFill.INSERT);
        TableFill modify_time = new TableFill("modify_time", FieldFill.INSERT);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(create_time);
        tableFills.add(modify_time);
        //将自动填充的配置们都配置到 策略配置里面
        strategyConfig.setTableFillList(tableFills);
        //设置乐观锁
        strategyConfig.setVersionFieldName("version");
        //生成RestController，
        strategyConfig.setRestControllerStyle(true);
        //驼峰转连字符
        //@RequestMapping("/managerUserActionHistory")</code> ->
        // <code>@RequestMapping("/manager-user-action-history")</code>
        strategyConfig.setControllerMappingHyphenStyle(true);

        //将策略配置添加到自动配置里
        autoGenerator.setStrategy(strategyConfig);

        //执行
        autoGenerator.execute();

    }
}

















