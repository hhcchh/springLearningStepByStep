package com.mimi.bean;

import com.huwei.bean.Measurable;
import org.springframework.stereotype.Component;

@Component //只要加了这个注解 这个类就可以被spring 容器托管
public class PersonBmiTool implements Measurable {

    @Override   //算法类，提供计算bmi值的算法
    public double measure(Object obj) {
        if (obj == null) {
            return 0;
        }
        //  instanceof
        if (!(obj instanceof Person)) {
            return 0;
        }
        //类型转换
        Person p = (Person) obj;
        double bmi = p.getWeight() / (p.getHeight() * p.getHeight());
        //体重/身高＊身高
        return bmi;
    }

}
