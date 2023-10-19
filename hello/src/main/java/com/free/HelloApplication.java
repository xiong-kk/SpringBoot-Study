package com.free;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author free
 * @create 2023-10-19-22:41
 */
/*
* SpringBootApplication标注一个主程序类
* */
@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloApplication.class,args);
    }
}
