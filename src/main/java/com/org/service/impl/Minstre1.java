package com.org.service.impl;

import java.io.PrintStream;

public class Minstre1 {
    private PrintStream stream;

    public Minstre1(PrintStream stream) {
        this.stream = stream;
    }

    public void SingBeforeQuest() {
        stream.print("Fa la la,the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("The hee hee ,the brave knight " + "did embark on a guest!");
    }
}
