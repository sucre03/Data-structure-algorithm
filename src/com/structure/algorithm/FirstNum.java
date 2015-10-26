package com.structure.algorithm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 字符串中元素出现的个数
 * Created by 乔磊 on 2015/10/23.
 */
public class FirstNum {
    private Map<Object,Integer> getCountNum(Object[] obj){
        Map<Object,Integer> map = new HashMap<Object, Integer>();
        for(Object o:obj){
            if(map.containsKey(o)){
                map.put(o,(Integer)map.get(o)+1);
            }else{
                map.put(o,1);
            }
        }
        return map;
    }
    public static void main(String args[]){
        Integer[] a ={1,3,3,3,3,3,3,3,2,2,2,4,4,4,5,5,5,5,6,6,6};
        String[] b = {"a","a","b","c"};
        Map<Object,Integer> map = new FirstNum().getCountNum(b);
        for(Map.Entry<Object,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
    }
}
