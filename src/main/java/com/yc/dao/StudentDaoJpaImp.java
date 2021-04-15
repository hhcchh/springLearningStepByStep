package com.yc.dao;

import org.springframework.stereotype.Repository;

import javax.xml.ws.ResponseWrapper;
import java.util.Random;


@Repository
public class StudentDaoJpaImp implements StudentDao {

    @Override
    public int add(String name) {
        {
            System.out.println("jpa 添加学生："+name);
            Random r=new Random();
            return r.nextInt();
        }
    }
    @Override
    public void update(String name) {
        System.out.println("jpa 更新学生："+name);
    }
}
