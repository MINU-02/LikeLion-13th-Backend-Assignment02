package com.likelion.springprac.customer.api;

import com.likelion.springprac.customer.api.dto.CustomerDto;
import com.likelion.springprac.customer.application.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public void save(@RequestBody CustomerDto customerDto) {
        customerService.saveCustomer(customerDto);
    }

    @GetMapping("/{id}")
    public CustomerDto findCustomerById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }

    @GetMapping
    public List<CustomerDto> findAllCustomers() {
        return customerService.findAllCustomers();
    }

    @PatchMapping("/{id}")
    public void updateCustomer(@PathVariable Long id, @RequestBody CustomerDto customerDto) {
        customerService.updateCustomerById(id, customerDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomerById(id);
    }
}
