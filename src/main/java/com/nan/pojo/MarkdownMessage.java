/**
 * Copyright 2020 bejson.com
 */
package com.nan.pojo;

import com.nan.pojo.component.At;
import com.nan.pojo.component.Markdown;

/**
 * Auto-generated: 2020-07-31 11:23:0
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class MarkdownMessage {

    private String msgtype;
    private Markdown markdown;
    private At at;
    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }
    public String getMsgtype() {
        return msgtype;
    }

    public void setMarkdown(Markdown markdown) {
        this.markdown = markdown;
    }
    public Markdown getMarkdown() {
        return markdown;
    }

    public void setAt(At at) {
        this.at = at;
    }
    public At getAt() {
        return at;
    }

}
