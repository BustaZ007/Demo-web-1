package com.example.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoWebApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext context = SpringApplication.run(DemoWebApplication.class, args);

        String port = context.getEnvironment().getProperty("server.port");

        InetAddress ip = InetAddress.getLocalHost();
        String hostname = ip.getHostName();

        System.out.println("http://localhost:" + port + "/");
    }

}
