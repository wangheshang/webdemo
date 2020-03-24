package com.shun.study.webdemo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "DemoService",//暴露服务名称
            targetNamespace = "demoService.com")
public interface DemoService {
    @WebMethod
    String getName(@WebParam(name = "userId") Long userId);


}
