package edu.zisu.phoneMall.service.impl;

import edu.zisu.phoneMall.service.UserService;
import edu.zisu.phoneMall.client.UserMapper;
import edu.zisu.phoneMall.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuyifei on 2018/1/13.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByNameAndPasswd(User user) {
        return userMapper.selectByUserNameAndPassWd(user);
    }

    @Override
    public Boolean insertUser(User user) {
        int i = userMapper.insert(user);
        log.error("插入数据库返回值: " + i);
        return true;
    }
}
