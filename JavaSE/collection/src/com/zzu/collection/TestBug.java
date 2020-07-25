package com.zzu.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LGM
 * @date 2020/7/24 -- 14:41
 */
public class TestBug {
    public static void main(String[] args) {
        List list = new ArrayList(6);
        //输出结果为0
        //注意size与capacity的区别
        System.out.println(list.size());
        //java.lang.IndexOutOfBoundsException
        list.set(1,"Str");
    }

}
