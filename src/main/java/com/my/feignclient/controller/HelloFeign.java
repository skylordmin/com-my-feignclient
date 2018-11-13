package com.my.feignclient.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(value="server-provider")
@RestController
@RequestMapping("/hello")
public interface HelloFeign {

   @RequestMapping("/getUser")
   String hello();

}
