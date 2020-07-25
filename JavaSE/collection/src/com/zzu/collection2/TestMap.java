package com.zzu.collection2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LGM
 * @date 2020/7/24 -- 17:43
 */
public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",301);
        map.put("name","马化腾");
        map.put("salary",123456);
        Map map2 = new HashMap();
        map2.put("id",302);
        map2.put("name","马化");
        map2.put("salary",23456);
        Map map3 = new HashMap();
        map3.put("id",303);
        map3.put("name","马腾");
        map3.put("salary",3456);
        List<Map> list = new ArrayList<>();
        list.add(map);
        list.add(map2);
        list.add(map3);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i).get("name")+":"+list.get(i).get("salary"));
        }
    }
}
