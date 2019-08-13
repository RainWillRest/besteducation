package com.education.service.impl;

import com.education.dao.RoleMenuMapper;
import com.education.pojo.RoleMenuKey;
import com.education.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sun on 2019/8/9.
 */
public class RoleMenuServiceImpl implements RoleMenuService {

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public RoleMenuKey save(RoleMenuKey entity) {
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
    public RoleMenuKey seleteById(String id) {
        return null;
    }

    @Override
    public List<RoleMenuKey> findPage(int pageNum, int pageSize) {
        return null;
    }
}
