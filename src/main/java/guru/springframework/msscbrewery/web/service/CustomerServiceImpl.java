package guru.springframework.msscbrewery.web.service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Baltica")
                .build();
    }
}
