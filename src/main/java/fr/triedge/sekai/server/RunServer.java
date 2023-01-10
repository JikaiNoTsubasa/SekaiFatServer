package fr.triedge.sekai.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunServer {
    public static void main(String[] args) {
        RunServer r = new RunServer();
        r.start(args);
    }

    public void start(String[] args){
        SpringApplication app = new SpringApplication(RunServer.class);
        app.run(args);
    }
}
