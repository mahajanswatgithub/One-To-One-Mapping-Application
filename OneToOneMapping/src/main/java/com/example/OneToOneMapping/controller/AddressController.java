package com.example.OneToOneMapping.controller;

import com.example.OneToOneMapping.model.Address;
import com.example.OneToOneMapping.service.AddressService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

 //     create a new address
    @PostMapping("address")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }

//    get all addresses
    @GetMapping("address")
    public Iterable<Address> getAddress()
    {
        return addressService.getAddress();
    }

//     get an address by id
    @GetMapping("address/id/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id)
    {
        return addressService.getAddressById(id);
    }


//    update an address by id
    @PutMapping("address/{id}/{city}")
    public void updateAddressByCity(@PathVariable Long id,@PathVariable String city)
    {
        addressService.updateAddressByCity(id,city);
    }

//     delete an address by id
    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Long id)
    {
        return addressService.deleteAddressById(id);
    }
}
