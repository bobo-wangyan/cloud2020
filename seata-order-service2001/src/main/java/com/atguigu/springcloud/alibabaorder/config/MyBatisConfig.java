package com.atguigu.springcloud.alibabaorder.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.atguigu.springcloud.alibabaorder.dao"})
public class MyBatisConfig {
}
