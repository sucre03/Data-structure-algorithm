package com.structure.algorithm;

/**
 * 调整数组顺序使奇数位于偶数前面
 * Created by 乔磊 on 2015/10/26.
 */
public class ExchangeWordPosition {
    private int[] exchange(int[] obj){
        //数组头指针
        int pre = 0;
        //数组尾指针
        int suf = obj.length -1;
        int temp =0;

        while(pre < suf){
            //从前往后找，一直找到偶数为止
            while(pre < suf && !isEven(obj[pre])){
                pre++;
            }
            //从后往前找，一直找到奇数为止
            while(pre < suf && isEven(obj[suf])){
                suf--;
            }
            //奇数、偶数位置互换
            if(isEven(obj[pre]) && !isEven(obj[suf])){
                temp = obj[pre];
                obj[pre] = obj[suf];
                obj[suf] = temp;
            }
        }
        return obj;
    }
    private boolean isEven(int num){
        return (num & 1) ==0;
    }
    public static void main(String[] args){
        int[] a ={1,8,3,2,5,6,4,7,9};
        int[] b ={1,2,3,4,5};
        b = new ExchangeWordPosition().exchange(a);
        for(int m:b){
            System.out.print(m);
        }
    }
}
