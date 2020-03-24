package com.syntax.class15;

public class Numbers {
	void number(int a) {
        if (a%2==0) {
            System.out.println(a+" is even");
        }else {
            System.out.println(a+" is odd");
        }
    }
    public static void main(String[] args) {
        Numbers result=new Numbers();
        
        result.number(20);
    }

}
