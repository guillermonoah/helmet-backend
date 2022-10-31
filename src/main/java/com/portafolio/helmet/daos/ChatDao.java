package com.portafolio.helmet.daos;

import com.portafolio.helmet.entities.Chat;

import java.util.List;

public interface ChatDao {
    List<Chat> obtenerChat();

    Chat guardarChat(Chat chat);
}
