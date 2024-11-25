package org.sid.billingservice.service;

import org.sid.billingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {
   @GetMapping(path = "/api/customers/{id}")
   Customer findCustomerById (@PathVariable Long id);
}