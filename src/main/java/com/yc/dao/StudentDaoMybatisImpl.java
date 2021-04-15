package com.yc.dao;

import org.springframework.stereotype.Repository;

import java.util.Random;
@Repository  //异常转换   EX -》 runtime
public class StudentDaoMybatisImpl implements StudentDao  {
    @Override
    public int add(String name) {
        {
            System.out.println("mb 添加学生："+name);
            Random r=new Random();
            return r.nextInt();
        }
    }
    @Override
    public void update(String name) {
        System.out.println("mb 更新学生："+name);
    }
}
