package com.org.panda.spring.service;

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Integer a = new Integer(2);
        System.out.println(a.hashCode());

/*        MyInteger myInteger=new MyInteger(2);
        System.out.println(myInteger.hashCode());

        System.out.println(myInteger.equals(a));*/

        MyInteger myInteger1=new MyInteger(1);
        MyInteger myInteger2=new MyInteger(17);
        System.out.println(myInteger1.hashCode());
        System.out.println(myInteger2.hashCode());

        HashMap<MyInteger,Integer> integerHashMap=new HashMap<>(16);
        integerHashMap.put(myInteger1,1);
        integerHashMap.put(myInteger2,2);

        System.out.println("myInteger1:" +integerHashMap.get(myInteger1));
        System.out.println("myInteger2:" +integerHashMap.get(myInteger2));

        System.out.println("equal=="+myInteger1.equals(myInteger2));

    }
}

class MyInteger {
    int i;

    public MyInteger(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return  i;
    }

    @Override
    public boolean equals(Object object){
        return true;
    }

/*    @Override
    public String toString(){
        return "1";
    }*/
}
