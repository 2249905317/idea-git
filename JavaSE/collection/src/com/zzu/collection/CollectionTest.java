package com.zzu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author LGM
 * @date 2020/7/24 -- 12:27
 */
public class CollectionTest {
    public static void main(String[] args) {
        //多态：不能调用子类新增方法
        Collection<String> collection = new ArrayList<>();
        //boolean add(E e)  添加元素
        collection.add("中国");
        collection.add("俄罗斯");
        collection.add("巴基斯坦");
       /* //int size() 集合大小
        System.out.println(collection.size());
        //boolean contains(Object o) 集合是否包含指定元素，建议重写equals比较内容
        System.out.println(collection.contains("中国"));
        //boolean remove(object o) 删除指定元素
        System.out.println(collection.remove("巴基斯坦"));
        System.out.println(collection.size());
        //boolean isEmpty() 判断容器是否为空
        System.out.println(collection.isEmpty());
        //clear 清空容器
        collection.clear();
        System.out.println(collection.isEmpty());*/
        //Object[] toArray()     T[] toArray(T[] a)
        //将集合中的元素存储到数组中
        Object[] arr2 = collection.toArray();
        String[] arr = collection.toArray(new String[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"---");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"---");
        }
        System.out.println();
        iterCol(collection);

    }

    /**
     * 遍历集合的3种方式
     * 1、foreach
     * 2、iterator() 迭代器
     * 3、使用toArray函数将集合元素存储在数组中，在使用fori循环
     * @param collection
     */
    public static void iterCol(Collection<?> collection){
        System.out.println("---------增强for循环----------");
        for (Object o : collection) {
            System.out.print(o+"---");
        }
        System.out.println();
        System.out.println("--------iter()迭代器----------");
        Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()){
            Object temp = iterator.next();
            System.out.print(temp+"--");
        }
    }
}
