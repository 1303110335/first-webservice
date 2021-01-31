/**
 * xuleyan
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package io.spring.config;

/**
 * @author xuleyan
 * @version CountryEndpoint.java, v 0.1 2021-01-31 10:09 PM xuleyan
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;

@Endpoint //使用Spring WS注册该类作为处理传入SOAP消息的潜在候选者
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private CountryRepository countryRepository;

    @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest") //Spring WS使用它来根据消息的名称空间和localPart选择处理程序方法。
    @ResponsePayload //将返回值映射到响应
    public GetCountryResponse getCountry(
            @RequestPayload GetCountryRequest request // 表示传入消息将映射到方法的请求参数
    ) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));

        return response;
    }
}