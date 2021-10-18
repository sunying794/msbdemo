package com.service;

import com.entity.UmsMember;
//import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author baomidou
 * @since 2021-10-17
 */
public interface IUmsMemberService /*extends IService<UmsMember>*/ {

    void insert(UmsMember umsMember);
    UmsMember getUmsMember(int id);
}
