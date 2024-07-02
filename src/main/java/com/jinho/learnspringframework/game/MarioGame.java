package com.jinho.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("down");
    }

    public void left() {
        System.out.println("left");
    }

    public void right() {
        System.out.println("right");
    }
}
