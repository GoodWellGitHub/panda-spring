package com.org.service.impl;

import com.org.service.Quest;

import java.io.PrintStream;
import java.util.Queue;
import java.util.stream.Stream;

public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
