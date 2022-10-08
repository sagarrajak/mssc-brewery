package sagar.springtutorial.msscbrewery.web.service;

import sagar.springtutorial.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    public CustomerDto getCustomerById(UUID id);
}
