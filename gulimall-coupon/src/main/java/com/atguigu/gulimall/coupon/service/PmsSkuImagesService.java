package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.PmsSkuImagesEntity;

import java.util.Map;

/**
 * skuÍ¼Æ¬
 *
 * @author Chong Lai
 * @email thecyberfrank@gmail.com
 * @date 2020-12-16 11:38:31
 */
public interface PmsSkuImagesService extends IService<PmsSkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

