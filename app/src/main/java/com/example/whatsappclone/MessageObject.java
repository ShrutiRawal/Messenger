package com.example.whatsappclone;

import java.util.ArrayList;

public class MessageObject {

    String messageId,
            senderId,
            message;
    ArrayList<String> mediaUrlList;

    public MessageObject(String messageId, String senderId, String message,ArrayList<String> mediaUrlLis) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.message = message;
        this.mediaUrlList = mediaUrlList;
    }

    public String getMessage() {
        return message;
    }


    public String getSenderId() {
        return senderId;
    }

    public String getMessageId() {
        return messageId;
    }

    public ArrayList<String> getMediaUrlList() {
        return mediaUrlList;
    }
}
