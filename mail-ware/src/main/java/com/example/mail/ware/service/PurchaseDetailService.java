package com.example.mail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.mail.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author dd
 * @email dd@gmail.com
 * @date 2023-11-28 23:04:21
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

