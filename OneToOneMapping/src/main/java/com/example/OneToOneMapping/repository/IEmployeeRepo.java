package com.example.OneToOneMapping.repository;

import com.example.OneToOneMapping.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
    @Transactional
    @Modifying
    @Query(value = "update Employee set Last_Name = :lastName where Employee_Id = :id",nativeQuery = true)
    void updateEmployeeByLastName(Long id, String lastName);


}
