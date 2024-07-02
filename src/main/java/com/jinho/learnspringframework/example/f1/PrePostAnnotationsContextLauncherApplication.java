package com.jinho.learnspringframework.example.f1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("Somesflksnflsn");
    }

}

@Component
class SomeDependency {

}


@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
    

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {

        }
    }
}

