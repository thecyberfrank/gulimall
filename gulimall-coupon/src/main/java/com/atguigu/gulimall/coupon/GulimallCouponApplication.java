package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 使用nacos作为配置中心的的步骤：
 * 1. 引入依赖
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-alibaba-nacos-config</artifactId>
 *         </dependency>
 * 2.创建bootstrap.properties，并配置当前应用名和配置中心服务器的地址
 *     spring.application.name=gulimall-coupon
 *     spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *
 * 3.在nacos配置中心里创建(应用名.properties): gulimall-coupon.properties，并配置所需要的配置
 * 4.在类名上使用注解 @RefreshScope动态获取配置并实时刷新，在类中使用@Value注解加载nacos里的配置
 *     @Value("${member.name}")
 *     private String name;
 *
 * 配置中心细节：
 * namespace命名空间：用于配置隔离，项目中将每个微服务创建一个命名空间，微服务之间配置隔离
 * group配置分组：每个微服务的配置各有三组，代表不同环境，分别是dev,test,product，如果双十一大促可以再创建双11配置组
 */
//服务注册到注册中心
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
