package com.example.simplewebapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.CommandLinePropertySource;

import java.util.Arrays;

@SpringBootApplication
public class SimpleWebAppApplication
{

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebAppApplication.class, args);
    }


    @Bean
    public CommandLineRunner runner(ApplicationContext ctxt)
    {
        return args ->
        {
            System.out.println("Trolllololo! HCheck commiting");

            String[] beanNames = ctxt.getBeanDefinitionNames();
            Arrays.sort(beanNames);

            for (String name : beanNames)
            {
                System.out.println(name);
            }

        };
    }


}
