package com.education.service.impl;



import com.education.dao.UserMapper;
import com.education.pojo.User;
import com.education.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sun on 2019/8/9.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User seleByUserName(String userName) {
        return null;
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public boolean deleteBatchIds(List<String> idList) {
        return false;
    }

    @Override
    public User seleteById(String id) {
        return null;
    }

    @Override
    public List<User> findPage(int pageNum, int pageSize) {
        return null;
    }
}