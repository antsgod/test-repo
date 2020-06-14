package com.comanche.crazyJava.chapter08.section02.class05;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicateTest {
    static List<String> list = new ArrayList<>();
    {
        list.add("hello");
        list.add("hao");
        list.add("hco");
        list.add("world");
        list.add("hex");
    }

    /**
     * 使用Predicate，删除集合中的元素
     * @param args
     */
    public static void main(String[] args) {
        list.removeIf(item -> new StringBuilder(item).charAt(item.length()-1) == 'o');//删除如果最后一位为o
        list.forEach(System.out::println);
    }
    /**
     * 使用Predicate，删除集合中的元素
     */
    @Test
    public void test1(){
        //统计list中长度==5的个数
        System.out.println(getCount(list,element -> ((String)element).length() == 5));
        //统计list中最后一位是o的个数
        System.out.println(getCount(list,element -> new StringBuilder(((String)element)).charAt(((String)element).length()-1) == 'o'));
    }
    /**
     * 使用流实现删除集合中的元素
     */
    @Test
    public void test2(){
        long count = list.stream().filter(element -> ((String)element).length() == 5).count();
        System.out.println(count);
        long count1 = list.stream().filter(element -> new StringBuilder(((String)element)).charAt(((String)element).length()-1) == 'o').count();
        System.out.println(count1);
    }


    public static int getCount(List<String> list, Predicate predicate) {
        int count = 0;
        for (String s : list) {
            if(predicate.test(s)){
                count++;
            }
        }
        return  count;
    }
}
