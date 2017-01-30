package io.khasang.inspection.messaging;

import io.khasang.inspection.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Messages{

    List<User> userList;

    List<String> messageList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<String> messageList) {
        this.messageList = messageList;
    }

    public Messages() {
        this.messageList = new ArrayList<String>();
        this.userList = new ArrayList<User>();
    }
}
