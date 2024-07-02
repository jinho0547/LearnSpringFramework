package com.jinho.learnspringframework.example.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

    Dependency1 dependency1;
    Dependency2 dependency2;

//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }

    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Dependency1: " + dependency1 +  "\nDependency2: " + dependency2;
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionAppLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DepInjectionAppLauncherApplication.class)) {
            System.out.println(context.getBean("yourBusinessClass").toString());
        }
    }
}