package com.example.OneToOneMapping.service;

import com.example.OneToOneMapping.model.Address;
import com.example.OneToOneMapping.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;


    public Optional<Address> getAddressById(Long id) {
        return iAddressRepo.findById(id);
    }

    public void addAddress(Address address) {
        iAddressRepo.save(address);
    }
    public void updateAddressByCity(Long id, String city) {
        iAddressRepo.updateAddressByCity(id,city);
    }
    public String deleteAddressById(Long id) {
        iAddressRepo.deleteById(id);
        return "Address Deleted Successfully";
    }

    public Iterable<Address> getAddress() {
        return iAddressRepo.findAll();
    }
}
