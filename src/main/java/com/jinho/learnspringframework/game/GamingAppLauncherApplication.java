package com.jinho.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.jinho.learnspringframework.game")
public class GamingAppLauncherApplication {


//    @Bean
//    public GameRunner gameRunner(Game game) {
//        return new GameRunner(game);
//    }

//    @Bean
//    public Game game() {
//        return new MarioGame();
//    }

    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}

