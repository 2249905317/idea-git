package com.zzu.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LGM
 * @date 2020/7/24 -- 17:23
 * 测试 Set 的常用方法
 */
public class TestSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("aaa");
        set.add("bbb");
        set.add(new String("aaa"));
        System.out.println(set.size());
        System.out.println(set.contains("aaa"));
        set.remove("aaa");
        System.out.println(set.size());
    }
}
