package edu.zisu.phoneMall.chilent.impl;

import edu.zisu.phoneMall.chilent.UserService;
import edu.zisu.phoneMall.client.UserMapper;
import edu.zisu.phoneMall.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuyifei on 2018/1/13.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByNameAndPasswd(User user) {
        return userMapper.selectByUserNameAndPassWd(user);
    }

    @Override
    public Boolean insertUser(User user) {
        return null;
    }
}
