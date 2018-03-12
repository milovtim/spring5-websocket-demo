package com.example.websocketdemo.model

class ChatMessage {
    MessageType type
    String content
    String sender

    enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}
