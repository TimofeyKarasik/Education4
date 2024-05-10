package edu.innotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "edu.innotech")
public class Start {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Start.class);
        App app = ctx.getBean(App.class);
        app.execute();
    }
}
