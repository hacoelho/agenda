package br.com.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class AgendaApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(AgendaApplication.class,args);
    }
}