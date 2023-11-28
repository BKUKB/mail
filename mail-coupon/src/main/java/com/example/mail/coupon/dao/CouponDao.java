package com.example.mail.coupon.dao;

import com.example.mail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dd
 * @email dd@gmail.com
 * @date 2023-11-28 22:49:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
