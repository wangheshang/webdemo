package com.shun.study.webdemo.webservice;


import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(serviceName = "DemoService",// 与接口中指定的name一致
        targetNamespace = "http://demoService.com",// 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.shun.study.webdemo.webservice.DemoService"  ) // Service接口地址
@Component
public class DemoServiceImpl implements  DemoService {
    @Override
    public String getName(Long userId) {
        return null;
    }
}
