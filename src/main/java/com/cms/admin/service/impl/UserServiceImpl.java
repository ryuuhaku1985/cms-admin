package com.cms.admin.service.impl;

import com.cms.admin.domain.slave.User;
import com.cms.admin.mapper.slave.UserMapper;
import com.cms.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * descripiton:
 *
 * @author: kinson(2219945910 @ qq.com)
 * @date: 2019/1/31
 * @time: 21:56
 * @modifier:
 * @since:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {
        return userMapper.selectUserList();
    }

    @Override
    @Transactional(value = "slaveTransactionManager")
    public void update(User user) {
        userMapper.update(user);
        int i = 10 / 0;
    }
}
