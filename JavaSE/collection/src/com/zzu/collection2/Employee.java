package com.zzu.collection2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LGM
 * @date 2020/7/24 -- 17:31
 */
public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private Date hireDate;

    public Employee(int id, String name, double salary, String department, String hireDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        DateFormat format = new SimpleDateFormat("yyyy-MM");
        try {
            this.hireDate = format.parse(hireDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
