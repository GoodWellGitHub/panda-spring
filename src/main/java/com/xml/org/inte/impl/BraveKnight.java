package com.xml.org.inte.impl;

import com.xml.org.inte.Knight;
import com.xml.org.inte.Quest;

public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
