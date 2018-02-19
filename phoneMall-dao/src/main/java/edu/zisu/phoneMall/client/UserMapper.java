package edu.zisu.phoneMall.client;

import edu.zisu.phoneMall.user.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(User record);

    User selectByPrimaryKey(Integer uId);

    User selectByUserNameAndPassWd(User user);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}
