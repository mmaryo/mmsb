package fr.app.utils;

import fr.app.api.slack.core.SlackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


//    THE PROBLEME IS HERE
//    REMOVE IT FOR SUCCESSFULLY MAVEN BUILD
    @Autowired
    private SlackService slackService;


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}