package com.example.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.mail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author dd
 * @email dd@gmail.com
 * @date 2023-11-28 22:55:47
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

