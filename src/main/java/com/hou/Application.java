package com.hou;

import com.hou.Thread.myThread;
import com.hou.pojo.Cat;
import com.hou.pojo.People;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;


@Slf4j
@SpringBootApplication(scanBasePackages = "com.hou")
@EnableConfigurationProperties(People.class)
public class Application {

    public static void main(String[] args) {
       new SpringApplicationBuilder()
               .sources(Application.class)
               .main(Application.class)
               .run(args);
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());

    }
}
