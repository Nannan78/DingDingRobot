package com.nan.pojo.component;

/**
 * Copyright 2020 bejson.com
 */

import java.util.List;

/**
 * Auto-generated: 2020-07-31 11:45:46
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ActionCard {

    private String title;
    private String text;
    private String btnOrientation;
    private String singleTitle;
    private String singleURL;
    private List<Btns> btns;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "AC{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", btnOrientation='" + btnOrientation + '\'' +
                ", singleTitle='" + singleTitle + '\'' +
                ", singleURL='" + singleURL + '\'' +
                ", btns=" + btns +
                '}';
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public void setBtnOrientation(String btnOrientation) {
        this.btnOrientation = btnOrientation;
    }
    public String getBtnOrientation() {
        return btnOrientation;
    }

    public void setSingleTitle(String singleTitle) {
        this.singleTitle = singleTitle;
    }
    public String getSingleTitle() {
        return singleTitle;
    }

    public void setSingleURL(String singleURL) {
        this.singleURL = singleURL;
    }
    public String getSingleURL() {
        return singleURL;
    }

    public void setBtns(List<Btns> btns) {
        this.btns = btns;
    }
    public List<Btns> getBtns() {
        return btns;
    }

}
