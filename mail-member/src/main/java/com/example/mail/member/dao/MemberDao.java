package com.example.mail.member.dao;

import com.example.mail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dd
 * @email dd@gmail.com
 * @date 2023-11-28 22:55:47
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
