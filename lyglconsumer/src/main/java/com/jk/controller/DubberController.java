package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.User;
import com.jk.service.DubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("dubberController")
public class DubberController {

    @Resource
    private DubboService dubboService;

    @RequestMapping("queryUser")
    @ResponseBody
    public String queryUser(User user){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        ac.start();
        DubboService dubboService= (DubboService) ac.getBean("dubboService");
        List<User> docu = dubboService.queryUser(user);

        return JSON.toJSONString(docu);
    }


}
