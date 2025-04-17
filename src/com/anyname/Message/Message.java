package com.anyname.Message;

import com.anyname.User.User;

import java.time.LocalDateTime;

public class Message {
    private int id;
    private String content;
    private String status;
    private User sender;
    private LocalDateTime sentAt = LocalDateTime.now();

    public Message(int id, String content, User sender, LocalDateTime sentAt) {
        this.id = id;
        this.content = content;
        this.status = status;
        this.sender = sender;
        this.sentAt = sentAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
}
