package com.rain.service.user;

import com.rain.domain.User;

import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
public interface IUserSerivce {
    User login(String loginname, String password);

    List<User> get_UserList();

    List<User> get_UserLikeList(String content);

    User get_UserInfo(Integer id);

    void update_UserInfo(User notice);

    void insert_UserInfo(User notice);

    void delete_UserInfo(Integer id);
}
