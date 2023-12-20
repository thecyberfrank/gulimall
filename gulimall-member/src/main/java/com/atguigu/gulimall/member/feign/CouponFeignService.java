package com.atguigu.gulimall.member.feign;

import com.atguigu.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


//FeignClient注解声明该接口是Web服务客户端，会远程调用gulimall-coupon服务的接口
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    // 映射HTTP请求到特定的处理方法上
    @RequestMapping("/coupon/coupon/memberCoupons/list")
    public R getMemberCoupons();

}
