package com.github.joschi.springboot.testcontainers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {RedisTest.TestConfig.class})
public class RedisTest {
    @Test
    void contextLoads() {
    }

    @EnableConfigurationProperties
    static class TestApplication {
        public static void main(String[] args) {
            SpringApplication.run(TestApplication.class, args);
        }
    }

    @SpringBootConfiguration
    static class TestConfig {
    }
}
