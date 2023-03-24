package com.dlg.adt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Slf4j
@EnableFeignClients
@EnableScheduling
public class AirDataTransferApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirDataTransferApplication.class, args);
        log.info("启动成功   版本号：V1");
    }

}
