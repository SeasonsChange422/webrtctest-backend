package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * @author dhx
 * @date 2024/6/28 13:47
 */
@EnableWebSocket
@SpringBootApplication
public class WsServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WsServerApplication.class, args);
    }
}
