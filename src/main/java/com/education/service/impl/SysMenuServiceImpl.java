package com.education.service.impl;


import com.education.dao.SysMenuMapper;
import com.education.pojo.SysMenu;
import com.education.service.SysMenuService;
import com.education.utils.IDCreator;
import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by sun on 2019/8/2.
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public SysMenu save(SysMenu sysMenu) {
        SysMenu result = null;
        if (StringUtils.isBlank(sysMenu.getMenuId())){
            sysMenu.setMenuId(IDCreator.getId()
            );
        }
        try {
            sysMenuMapper.insertSelective(sysMenu);
            result = sysMenuMapper.selectByPrimaryKey(sysMenu.getMenuId());
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }


    @Override
    public boolean deleteById(String id) {

        return sysMenuMapper.deleteByPrimaryKey(id)>0;
    }

    //未完成方法
    @Override
    public boolean deleteBatchIds(List idList) {
        return false;
    }

    @Override
    public SysMenu seleteById(String id) {

        return sysMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysMenu> findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<SysMenu> listSysmenu = sysMenuMapper.selectAll();
        PageInfo pageInfo = new PageInfo(listSysmenu);
        return pageInfo.getList();
    }

}
