package com.example.OneToOneMapping.controller;

import com.example.OneToOneMapping.model.Address;
import com.example.OneToOneMapping.model.Employee;
import com.example.OneToOneMapping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

//    create a new employee
    @PostMapping("employee")
    public void addEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
    }
//     get all employees
    @GetMapping("employees")
    public void getEmployees()
    {
        employeeService.getEmployees();
    }

//     get an employee by id
    @GetMapping("employee/id/{id}")
    public void getEmployeeById(@PathVariable Long id)
    {
        employeeService.getEmployeeById(id);
    }



//     update an employee by id
    @PutMapping("employee/{id}/{lastName}")
    public void updateEmployeeByLastName(@PathVariable Long id,@PathVariable String lastName)
    {
        employeeService.updateEmployeeByLastName(id,lastName);
    }

//     delete an employee by id
    @DeleteMapping("employee/{id}")
    public String deleteEmployeeById(@PathVariable Long id)
    {
        return employeeService.deleteEmployeeById(id);
    }
}
