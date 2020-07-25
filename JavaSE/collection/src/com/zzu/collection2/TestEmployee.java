package com.zzu.collection2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LGM
 * @date 2020/7/24 -- 17:34
 * list 存储实体类对象
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(301,"马化腾",1000000,"老总","2003-06");
        Employee employee2 = new Employee(302,"马云",69999999,"老总","2003-10");
        Employee employee3 = new Employee(303,"任正非",5206896.23,"老总","2003-02");
        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee2);
        list.add(employee3);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i).getName()+":"+list.get(i).getHireDate());
        }
    }

}
