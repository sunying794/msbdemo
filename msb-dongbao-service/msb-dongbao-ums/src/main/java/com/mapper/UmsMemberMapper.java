package com.mapper;

import com.entity.UmsMember;
//import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author baomidou
 * @since 2021-10-17
 */
@Repository
public interface UmsMemberMapper/* extends BaseMapper<UmsMember> */{

    void insert(UmsMember umsMember);

}
