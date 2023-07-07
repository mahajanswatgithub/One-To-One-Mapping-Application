package com.example.OneToOneMapping.service;

import com.example.OneToOneMapping.model.Employee;
import com.example.OneToOneMapping.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public void getEmployees() {
        iEmployeeRepo.findAll();
    }

    public void getEmployeeById(Long id) {
        iEmployeeRepo.findByEmployeeId(id);
    }

    public void addEmployee(Employee employee) {
        iEmployeeRepo.save(employee);
    }

    public void updateEmployeeByLastName(Long id, String lastName) {
        iEmployeeRepo.updateEmployeeByLastName(id,lastName);
    }
//
    public String deleteEmployeeById(Long id) {
        iEmployeeRepo.deleteById(id);
        return "Employee Deleted";
    }
}
