package com.dmsg.message.vo;

/**
 * Created by jlcao on 2016/8/2.
 */
public class AskMessage extends MessageBody{
    private String msgId;
    private Boolean succ;
    private String msg;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public Boolean getSucc() {
        return succ;
    }

    public void setSucc(Boolean succ) {
        this.succ = succ;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
