package com.zzu.collection;

import java.util.Objects;

/**
 * @author LGM
 * @date 2020/7/24 -- 13:32
 */

public class Employee {
    private String name;
    private double money;

    public Employee() {
    }

    public Employee(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
