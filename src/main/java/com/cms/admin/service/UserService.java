package com.cms.admin.service;

import com.cms.admin.domain.slave.User;

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
public interface UserService {

    List<User> listUser();

    void update(User user);
}
