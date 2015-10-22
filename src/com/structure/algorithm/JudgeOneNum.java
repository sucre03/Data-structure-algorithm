package com.structure.algorithm;

/**
 * 用于判断一个数中1的个数
 * Created by 乔磊 on 2015/10/22.
 */
public class JudgeOneNum {
    /**
     * 判断输入的数字转为二进制后由几个1组成
     * @param num
     * @return
     */
    private static int containOneNum(int num){
        int count = 0;
        while(num!=0){
            ++count;
            num = (num -1) & num;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(containOneNum(8));
    }
}
