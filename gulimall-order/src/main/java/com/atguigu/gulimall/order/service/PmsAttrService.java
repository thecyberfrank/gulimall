package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.PmsAttrEntity;

import java.util.Map;

/**
 * ÉÌÆ·ÊôÐÔ
 *
 * @author Chong Lai
 * @email thecyberfrank@gmail.com
 * @date 2020-12-16 12:03:44
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

