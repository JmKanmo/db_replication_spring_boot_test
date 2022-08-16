package com.example.replication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ReplicationTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReplicationTestApplication.class, args);
    }

}
