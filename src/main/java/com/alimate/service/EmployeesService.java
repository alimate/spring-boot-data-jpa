package com.alimate.service;

import com.alimate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController
@RequestMapping("/employees")
public class EmployeesService {
    @Autowired private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/{employeeId}", method = DELETE)
    public String deleteEmployee(@PathVariable String employeeId) {
        employeeRepository.delete(employeeId);

        return "Deleted";
    }
}