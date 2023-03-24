package com.dlg.adt.config;


import com.dlg.adt.service.GasService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

/**
 * 注意：
 * org.apache.cxf.Bus
 * org.apache.cxf.bus.spring.SpringBus
 * org.apache.cxf.jaxws.EndpointImpl
 * javax.xml.ws.Endpoint
 *
 * @author gbx
 */
@Configuration
public class WebServiceConfig {

    @Resource
    private GasService gasService;



    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }


    /**
     * 注入servlet  bean name不能dispatcherServlet 否则会覆盖dispatcherServlet
     *
     * @return
     */
    @Bean(name = "cxfServlet")
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/ws/*");
    }


    /**
     * 注册WebServiceDemoService接口到webservice服务
     *
     * @return
     */
    @Bean(name = "endpoint")
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), gasService);
        endpoint.publish("/gasService");
        return endpoint;
    }
}
