package com.jinho.learnspringframework.example.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
        System.out.println("All Dependencies are Ready");
    }

    // Dependency 가 로딩 된 후 Spring에서 PostConstruct 어노테이션이 사용 된 메서드를 호출한다.
    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    // bean 이 소멸되기 전 실행햐야 하는 메서드에 적용한다.
    @PreDestroy
    public void cleanUp() {
        System.out.println("Clean Up!");
    }

}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("SomeDependency getReady");
    }
}


@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
    

    public static void main(String[] args) {
//        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
//
//        }

        // try-with-resource 문을 활용하여 context resource 를 반납하지 않는 경우에는 @PreDestroy 어노테이션을 적용한 cleanUp() 메서드를 호출하지 않는다.
        var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);
        System.out.println("끝났다!");
        context.close();
    }
}

