package com.education.service.impl;

import com.education.pojo.Role;
import com.education.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sun on 2019/8/9.
 */
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleService roleService;

    @Override
    public Role save(Role entity) {
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
    public Role seleteById(String id) {
        return null;
    }

    @Override
    public List<Role> findPage(int pageNum, int pageSize) {
        return null;
    }

}
