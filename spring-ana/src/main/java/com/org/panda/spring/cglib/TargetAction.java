package com.org.panda.spring.cglib;

public class TargetAction {
    private String info;
    public TargetAction(){

    }

    public TargetAction(String info){
        this.info=info;
    }


    public String doSomething(){
        System.out.println("cglib do proxy "+ info);

        return "proxy "+info;
    }
}
