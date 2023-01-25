package com.sap.springbootcache.controller;

import com.sap.springbootcache.model.Customer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {
  @RequestMapping(path = "/customerinfor")
  @Cacheable(value = "customerInfo")
  public List customerInformation(){
    List detail = Arrays.asList(new Customer(5126890,"Charlie Puth","Current A/c", 450000.00),new Customer(7620015,"Andrew Flintoff","Saving A/c", 210089.00));
  return detail;
  }
}
