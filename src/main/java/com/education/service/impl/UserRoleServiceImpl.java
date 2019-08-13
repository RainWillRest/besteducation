package com.education.service.impl;

import com.education.dao.UserRoleMapper;
import com.education.pojo.UserRoleKey;
import com.education.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sun on 2019/8/9.
 */
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public UserRoleKey save(UserRoleKey entity) {
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
    public UserRoleKey seleteById(String id) {
        return null;
    }

    @Override
    public List<UserRoleKey> findPage(int pageNum, int pageSize) {
        return null;
    }
}
