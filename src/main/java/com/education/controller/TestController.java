package com.education.controller;/**
 * @Author:
 * @Description:
 * @Date:2022/4/1813:04
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *@Author:
 *@Description:
 *@Date:2022/4/1813:04
 *
 */
@RestController
@RequestMapping("/")
public class TestController {
    @RequestMapping("/one")
    public String testOne(){
        return "今天";
    }

}
