package com.example.mail.ware.dao;

import com.example.mail.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author dd
 * @email dd@gmail.com
 * @date 2023-11-28 23:04:21
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
