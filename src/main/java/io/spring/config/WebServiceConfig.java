/**
 * xuleyan
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package io.spring.config;

/**
 * @author xuleyan
 * @version WebServiceConfig.java, v 0.1 2021-01-31 10:11 PM xuleyan
 */
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs // 开启WebService
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*"); // 通过"/ws/*"路径来发布WSDL文件
    }

    @Bean(name = "countries")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
        // 使用XsdSchema公开标准WSDL 1.1 发布描述文件，访问路径：http://<host>:<port>/ws/countries.wsdl
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CountriesPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
        wsdl11Definition.setSchema(countriesSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("countries.xsd"));
    }

    @Bean(name = "organizationRegister")
    public DefaultWsdl11Definition orgWsdl11Definition(XsdSchema organizationRegisterSchema) {
        // 使用XsdSchema公开标准WSDL 1.1 发布描述文件，访问路径：http://<host>:<port>/ws/countries.wsdl
        DefaultWsdl11Definition orgWsdl11Definition = new DefaultWsdl11Definition();
        orgWsdl11Definition.setPortTypeName("OrganizationRegisterPort");
        orgWsdl11Definition.setLocationUri("/orgws");
        orgWsdl11Definition.setTargetNamespace("http://spring.io/guides/org-producing-web-service");
        orgWsdl11Definition.setSchema(organizationRegisterSchema);
        return orgWsdl11Definition;
    }

    @Bean
    public XsdSchema organizationRegisterSchema() {
        return new SimpleXsdSchema(new ClassPathResource("organizationRegister.xsd"));
    }
}