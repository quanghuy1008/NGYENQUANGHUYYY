package com.example.ngyenquanghuyyy.service;

import com.example.ngyenquanghuyyy.entity.EmployeesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ngyenquanghuyyy.repository.EmployeesRepo;

import java.util.List;

@Service
public class EmployeesServicelmpl implements EmployeesService {
    @Autowired
    EmployeesRepo employeeRepo;


    @Override
    public List<EmployeesEntity> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeesEntity createEmployees(EmployeesEntity employees) {
        return employeeRepo.save(employees);
    }
}
