package com.example.jamesgray.interactivestory.model;

/**
 * Created by jamesgray on 5/18/17.
 */

public class Choice {
    private int textID;
    private int nextPage;



    public Choice(int textID, int nextPage) {
        this.textID = textID;
        this.nextPage = nextPage;
    }

    public int getTextID() {
        return textID;
    }

    public void setTextID(int textID) {
        this.textID = textID;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
