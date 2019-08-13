package com.education.service;

import com.education.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by sun on 2019/8/9.
 */
@Service
public interface UserService extends StandardService<User,String> {
    User seleByUserName(String userName);
}
