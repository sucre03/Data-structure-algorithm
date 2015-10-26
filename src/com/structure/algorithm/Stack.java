package com.structure.algorithm;

/**
 * Created by 乔磊 on 2015/10/23.
 */
public class Stack {
    private Object[] array = new Object[6];
    private int top =-1;
    private boolean stackEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    private void push(Object t){
        if(top<=array.length -1){
            array[++top] = t;
        }else{
            System.out.print("over");
        }
    }
    private Object pop(int top){
        Object o = null;
        if(!stackEmpty()){
            o = array[top--];
        }else {
            System.out.print("under");
        }
        return o;
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push("a");
        s.push("A");
        s.push(97);
        s.push(65);
        s.push("c");
        s.push("C");
        System.out.print(s.pop(0));
    }
}
