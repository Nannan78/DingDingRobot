package com.nan.pojo.component;

import java.util.List;

public class At {
    private List<String> atMobiles;
    private boolean isAtAll;



    public List<String> getAtMobiles() {
        return atMobiles;
    }

    public void setAtMobiles(List<String> atMobiles) {
        this.atMobiles = atMobiles;
    }

    public boolean isAtAll() {
        return isAtAll;
    }

    public void setAtAll(boolean atAll) {
        this.isAtAll = atAll;
    }

    @Override
    public String toString() {
        return "At{" +
                "atMobiles=" + atMobiles +
                ", isAtAll=" + isAtAll +
                '}';
    }
/*
    *
    * private boolean isAtAll;
    private List<String> atMobiles;
    public void setIsAtAll(boolean isAtAll) {
        this.isAtAll = isAtAll;
    }
    public boolean getIsAtAll() {
        return isAtAll;
    }

    public void setAtMobiles(List<String> atMobiles) {
        this.atMobiles = atMobiles;
    }
    public List<String> getAtMobiles() {
        return atMobiles;
    }
    * */
}
