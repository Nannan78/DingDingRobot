package com.nan.pojo;

import com.nan.pojo.component.At;
import com.nan.pojo.component.Text;

public class TextMessage {

    private String msgtype;
    private Text text;
    private At at;

    @Override
    public String toString() {
        return "TextMessage{" +
                "msgtype='" + msgtype + '\'' +
                ", text=" + text +
                ", at=" + at +
                '}';
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public At getAt() {
        return at;
    }

    public void setAt(At at) {
        this.at = at;
    }
}
