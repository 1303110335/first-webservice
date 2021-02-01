/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package io.spring.controller;

import cn.org.chiss.rhin._2015.AdhocQuery;
import cn.org.chiss.rhin._2015.Integer;
import cn.org.chiss.rhin._2015.OrganizationQueryRequest;
import cn.org.chiss.rhin._2015.OrganizationQueryResponseMessage;
import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author xuleyan
 * @version PersonEndpoint.java, v 0.1 2021-02-01 10:20 上午
 */
@Endpoint
public class PersonEndpoint {

    private static final String NAMESPACE_URI = "http://www.chiss.org.cn/rhin/2015";

    //Spring WS使用它来根据消息的名称空间和localPart选择处理程序方法。
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "OrganizationQuery")
    //将返回值映射到响应
    @ResponsePayload
    // 表示传入消息将映射到方法的请求参数
    public OrganizationQueryResponseMessage getCountry(@RequestPayload OrganizationQueryRequest request) {
        Integer from = request.getFrom();
        Integer maxCount = request.getMaxCount();
        AdhocQuery adhocQuery = request.getAdhocQuery();

        OrganizationQueryResponseMessage response = new OrganizationQueryResponseMessage();
        response.setCount(from);
        Integer integer = new Integer();
        integer.setValue(maxCount.getValue());
        Integer integer2 = new Integer();
        integer2.setValue(2);
        response.setCount(integer2);
        response.setTotalCount(maxCount);
        return response;
    }

}