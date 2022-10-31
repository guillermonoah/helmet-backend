package com.portafolio.helmet.services;

import com.portafolio.helmet.daos.ChatDao;
import com.portafolio.helmet.entities.Chat;
import com.portafolio.helmet.repositories.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService implements ChatDao {
    @Autowired
    private ChatRepository chatRepository;

    @Override
    public List<Chat> obtenerChat(){
        return (List<Chat>) chatRepository.findAll();}

    @Override
    public Chat guardarChat(Chat chat){
        return chatRepository.save(chat);}
}
