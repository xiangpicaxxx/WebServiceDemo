package com.dlg.adt.service.impl;

import com.dlg.adt.service.GasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.jws.WebService;

/**
 * Description:
 *
 * @author 格兰德法则·祝
 * Date:2023/3/21 14:19
 **/
@Slf4j
@WebService(serviceName = "GasService", //与接口的服务名一致
        targetNamespace = "http://service.adt.dlg.com/", // 与接口空间 命名一致
        endpointInterface = "com.dlg.adt.service.GasService" // 接口地址
)
@Component
public class GasServiceImpl implements GasService {


    @Override
    public void addGasData(String companyId,
                           String assetId,
                           String gasType,
                           String dateTime,
                           float ppm,
                           String hasAlarm,
                           String hasDone) {
        log.info("我接收到了数据");
    }

    @Override
    public void test(String text) {
        log.info(text);
    }


}
