package com.example.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.mail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author dd
 * @email dd@gmail.com
 * @date 2023-11-28 21:52:42
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

