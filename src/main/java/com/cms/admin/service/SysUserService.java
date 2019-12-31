package com.cms.admin.service;

import com.cms.admin.domain.master.SysUser;

import java.util.List;

/**
 * descripiton:
 *
 * @author: kinson(2219945910 @ qq.com)
 * @date: 2019/1/31
 * @time: 21:55
 * @modifier:
 * @since:
 */
public interface SysUserService {

    List<SysUser> listUser();

    void update(SysUser sysUser);
}
