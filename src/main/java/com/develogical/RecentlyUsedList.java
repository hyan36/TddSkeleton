package com.develogical;

public class RecentlyUsedList {

    String item = "";
    int length = 0;
    public int getLength() {
        return length;
    }

    public void add(String thing) {
        item = thing;
        this.length = 1;
    }
}
