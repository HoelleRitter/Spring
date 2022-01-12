package com.alex.demo;

import com.alex.dao.Userdao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userDaodemo {
    public static void main(String[] args) {
        ApplicationContext app =new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Userdao ud =(Userdao) app.getBean("userDao");
        ud.save();
    }
}
