package com.jinho.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}
record Address(String street, String city, String country) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Jinho";
    }

    @Bean
    public int age() {
        return 30;
    }

    @Bean
    public Person person() {
        return new Person("Jinho", 29);
    }

    @Bean(name="address2")
    public Address address() {
        return new Address("Eunhaengdong", "SungNam", "Korea");
    }

    @Bean(name="address3")
    public Address address2() {
        return new Address("Jongro", "Seoul", "Korea");
    }

}
