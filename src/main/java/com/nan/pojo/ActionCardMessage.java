package com.nan.pojo;

import com.nan.pojo.component.ActionCard;

/**
 * Copyright 2020 bejson.com
 */

public class ActionCardMessage {

    private ActionCard actionCard;
    private String msgtype;

    @Override
    public String toString() {
        return "ACM{" +
                "actionCard=" + actionCard +
                ", msgtype='" + msgtype + '\'' +
                '}';
    }

    public void setActionCard(ActionCard actionCard) {
        this.actionCard = actionCard;
    }
    public ActionCard getActionCard() {
        return actionCard;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }
    public String getMsgtype() {
        return msgtype;
    }

}
