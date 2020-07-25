package com.zzu.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LGM
 * @date 2020/7/24 -- 15:50
 * 测试 Map 的方法
 */
public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("lgm",new GirlFriend("王心怡"));
        map.put("lgm","WXY");
        map.put(1,23);
        String lgm_girlFriend = (String) map.get("lgm");
        System.out.println("lgm_girlFriend = " + lgm_girlFriend);
        int age = (int) map.get(1);
        System.out.println(age);
        map.remove(1);
        System.out.println(map.containsKey(1));
        map.put(2,34);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue(34));
    }
}

class GirlFriend{
    String name;
    public GirlFriend(String name){
        this.name = name;
    }
}