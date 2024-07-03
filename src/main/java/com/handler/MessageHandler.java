package com.handler;

import javax.websocket.Session;

/**
 * @author dhx
 * @date 2024/6/30 13:00
 */
public interface MessageHandler {
    public void getMessage(String message, Session session);
}
