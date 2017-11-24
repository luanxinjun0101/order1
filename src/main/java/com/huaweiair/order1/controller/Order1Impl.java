package com.huaweiair.order1.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-24T06:12:55.202Z")

@RestSchema(schemaId = "order1")
@RequestMapping(path = "/huaweiair/v1", produces = MediaType.APPLICATION_JSON)
public class Order1Impl {

    @Autowired
    private Order1Delegate userOrder1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userOrder1Delegate.helloworld(name);
    }

}
