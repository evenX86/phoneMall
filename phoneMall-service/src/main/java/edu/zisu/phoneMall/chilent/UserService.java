package edu.zisu.phoneMall.chilent;

import edu.zisu.phoneMall.user.User;

/**
 * Created by xuyifei on 2018/1/13.
 */
public interface UserService {
    public User getUserByNameAndPasswd(User user);

    public Boolean insertUser(User user);
}
