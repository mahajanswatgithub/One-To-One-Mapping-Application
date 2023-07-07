package com.example.OneToOneMapping.repository;

import com.example.OneToOneMapping.model.Address;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {

    @Transactional
    @Modifying
    @Query(value = "update Address set City = :city where Address_Id = :id",nativeQuery = true)
    void updateAddressByCity(Long id, String city);


}
