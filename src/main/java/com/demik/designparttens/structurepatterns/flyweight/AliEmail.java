package com.demik.designparttens.structurepatterns.flyweight;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 3:13 PM
 * @since JDK 1.8
 */
public class AliEmail implements EmailInf {

    private String receiver;
    private String sender;
    private String content;
    private Long time;
    private String title;

    public AliEmail(String receiver, String sender, String content, Long time, String title) {
        this.receiver = receiver;
        this.sender = sender;
        this.content = content;
        this.time = time;
        this.title = title;
    }

    @Override
    public String getEmail() {
        return "AliEmail{" +
                "receiver='" + receiver + '\'' +
                ", sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", title='" + title + '\'' +
                '}';
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
