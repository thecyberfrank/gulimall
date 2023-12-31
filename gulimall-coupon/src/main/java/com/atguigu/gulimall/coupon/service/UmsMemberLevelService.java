package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.UmsMemberLevelEntity;

import java.util.Map;

/**
 * »áÔ±µÈ¼¶
 *
 * @author Chong Lai
 * @email thecyberfrank@gmail.com
 * @date 2020-12-16 11:38:31
 */
public interface UmsMemberLevelService extends IService<UmsMemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

