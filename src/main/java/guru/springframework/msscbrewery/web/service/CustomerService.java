package guru.springframework.msscbrewery.web.service;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomer(UUID customerId);
}
