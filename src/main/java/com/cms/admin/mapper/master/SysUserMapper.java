package com.cms.admin.mapper.master;

import com.cms.admin.domain.master.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * descripiton:
 *
 * @author: kinson(2219945910 @ qq.com)
 * @date: 2019/1/31
 * @time: 21:43
 * @modifier:
 * @since:
 */
@Mapper
public interface SysUserMapper {

    List<SysUser> selectUserList();

    void update(SysUser sysUser);
}
