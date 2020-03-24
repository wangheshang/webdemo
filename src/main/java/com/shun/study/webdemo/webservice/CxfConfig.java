package com.shun.study.webdemo.webservice;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * 集成webService 接口 很简单：三个要点
 * 1. 添加依赖
 * 2. 写一个CxfConfig配置文件
 * 3. 写一个service及其实现类Impl，注意点service及其实现类中的 serviceName与targetNamespace 要一致
 */

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private  DemoService demoService;

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus,demoService);
        endpoint.publish("/DemoService");
        return endpoint;
    }

}
