package com.gerry.yitao.yitaouploadwebapi;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = {"com.gerry.yitao"})
@EnableDubbo
public class YitaoUploadWebApiApplication {


    public static void main(String[] args) {
        SpringApplication.run(YitaoUploadWebApiApplication.class);
    }
}
