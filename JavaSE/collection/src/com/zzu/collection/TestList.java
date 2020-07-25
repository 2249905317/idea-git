package com.zzu.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author LGM
 * @date 2020/7/24 -- 15:15
 * 测试 List 中的方法
 */
public class TestList {
    public static void main(String[] args) {
        //ArrayList:底层实现是数组，查询效率高，增删改效率低。线程不安全
        //LinkedList:底层实现是链表，查询效率低，增删改效率高。线程不安全
        //Vector:线程安全，效率低。ArrayList所有方法加上 synchronized
        List list = new ArrayList();
        list.add("abc");
        list.add("abc");
        list.add(new Date());
        list.add(123);  //自动装箱
        list.remove(new String("abc"));
        int size = list.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
        list.set(0,678);
        size = list.size();
        System.out.println(("---------------------"));
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
        list.add(new Dog());
        boolean isRemove = list.remove(new Dog());
        size = list.size();
        System.out.println(("---------------------"+isRemove));
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(("---------------------"));
        List list2 = new ArrayList();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        list.add(list2);    //将对象 list2 作为一个整体添加到list中
        System.out.println(list.size());
        list.addAll(list2); //将 list2 中所有元素添加到list中
        System.out.println(list.size());
     //   list.addAll(list);
      //  System.out.println(list.size());

        System.out.println("---------------------------");
        int element_0 = (Integer) list.get(0);
        System.out.println(element_0);
        String element_final = (String) list.get(list.size()-1);
        System.out.println(element_final);
        System.out.println("--------------------------------");
        list.set(1,"ababababa");
        list.remove(0);
        size = list.size();
        System.out.println(("---------------------"));
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }
}
class Dog{

}
