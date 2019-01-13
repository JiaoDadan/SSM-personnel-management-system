package com.rain.service.user;

import com.rain.dao.UserDao;
import com.rain.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements IUserSerivce {

    @Autowired
    UserDao userDao;

    @Override
    public User login(String loginname, String password) {
        // TODO Auto-generated method stub
        User user = userDao.get_login(loginname, password);
        return user;
    }

    @Override
    public List<User> get_UserList() {
        // TODO Auto-generated method stub
        return userDao.get_List();
    }

    @Override
    public List<User> get_UserLikeList(String content) {
        // TODO Auto-generated method stub
        return userDao.get_LikeList(content);
    }

    @Override
    public User get_UserInfo(Integer id) {
        // TODO Auto-generated method stub
        return userDao.get_Info(id);
    }

    @Override
    public void update_UserInfo(User notice) {
        // TODO Auto-generated method stub
        userDao.update_Info(notice);
    }

    @Override
    public void insert_UserInfo(User notice) {
        // TODO Auto-generated method stub
//		Date date = new Date();
//		String year = String.format("%tY", date);
//		String month = String.format("%tB", date);
//		String day = String.format("%te", date);
//		notice.setCreate_date(year+month+day);
        userDao.insert_Info(notice);
    }

    @Override
    public void delete_UserInfo(Integer id) {
        // TODO Auto-generated method stub
        userDao.delete_Info(id);
    }
}
