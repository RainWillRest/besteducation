package com.education.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sun on 2019/8/9.
 */
public interface StandardService<T ,PK extends Serializable>{
    /**
     * 插入
     * @param entity
     * @return
     */
    T save(T entity);

    /**
     * 根据主键删除
     * @param id
     * @return
     */
    boolean deleteById(PK id);

    /**
     * 批量删除（根据主键）
     * @param idList
     * @return
     */
    boolean deleteBatchIds(List<PK> idList);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    T seleteById(PK id);

    /**
     * 分页查询
     * @param
     * @return
     */
    List<T> findPage(int pageNum, int pageSize);

}
