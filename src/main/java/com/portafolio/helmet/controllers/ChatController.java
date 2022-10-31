package com.portafolio.helmet.controllers;

import com.portafolio.helmet.daos.ChatDao;
import com.portafolio.helmet.entities.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatDao chatDao;

    @GetMapping
    public List<Chat> obtenerChat(){
        return chatDao.obtenerChat();}

    @PostMapping
    public Chat guardarChat(@RequestBody Chat chat){
        return chatDao.guardarChat(chat);}
}
