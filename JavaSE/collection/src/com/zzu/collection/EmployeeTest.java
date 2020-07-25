package com.zzu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author LGM
 * @date 2020/7/24 -- 13:44
 * 添加若干员工，求总工资和平均工资
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Collection<Employee> collection = new ArrayList<>();
        Employee employee = new Employee("黄明昊",999999);
        Employee employee2 = new Employee("王心冉",780000);
        Employee employee3 = new Employee("王天宇",620000);
        collection.add(employee);
        collection.add(employee2);
        collection.add(employee3);
        Iterator<Employee> iterator = collection.iterator();
        double total = 0.0;
        double avg = 0.0;
        while (iterator.hasNext()){
            Employee employeeTmp = iterator.next();
            total += employeeTmp.getMoney();
        }
        int size = collection.size();
        System.out.println("size = " + size);
        System.out.println("总工资："+total+",平均薪水："+total/size);
    }
}
