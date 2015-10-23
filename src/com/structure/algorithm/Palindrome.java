package com.structure.algorithm;

/**
 * Created by 乔磊 on 2015/10/23.
 * 回文，英文palindrome，指一个顺着读和反过来读都一样的字符串，比如madam、我爱我，这样的短句在智力性、趣味性和艺术性上都颇有特色，
 * 中国历史上还有很多有趣的回文诗。
 * 判断一个字串是否是回文？
 */
public class Palindrome {
    private static boolean judgePalindrome(char[] c){
        int size = c.length;
        int mid = size>>1;
        int left = mid -1;
        int right = mid +1;
        while(--mid>0){
            if(c[left--]!=c[right++]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String test = "abcdcba";
        System.out.print(judgePalindrome(test.toCharArray()));
    }
}
