package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 使用nacos远程调用其他服务的步骤
 * 1.引入open-feign
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
 *         </dependency>
 * 2。在Application文件中使用@EnableDiscoveryClient将自己注册到注册中心，使用@EnableFeignClients: 开启feign客户度的远程调用功能
 * 3.在feign目录下的接口，使用@FeignClient注解声明该接口是Web服务客户端，
 *   在该接口的方法上使用@RequestMapping注解，指定要调用哪个远程服务(其他controller的http服务地址)
 * 4.在其他service服务里，获取xxxFeignService，调用远程服务
 */
//EnableFeignClients: 开启feign客户度的远程调用功能, spring会扫描basePackages下的带有@FeignClient注解的接口
//EnableDiscoveryClient： 将自己注册到服务注册中心
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
