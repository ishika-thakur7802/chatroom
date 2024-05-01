package com.ishika.chatroom.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ishika.chatroom.Message;

@RestController
public class messageController {
    @MessageMapping("/message")
    @SendTo("/topic/return-to")

    public Message getContent(@RequestBody Message message)
    {
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        return message;
    }
}
