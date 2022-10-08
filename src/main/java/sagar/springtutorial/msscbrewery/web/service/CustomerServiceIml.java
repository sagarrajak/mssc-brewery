package sagar.springtutorial.msscbrewery.web.service;

import org.springframework.stereotype.Service;
import sagar.springtutorial.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceIml implements  CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().name("some name").id(id).build();
    }
}
