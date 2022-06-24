package com.example.ngyenquanghuyyy.service;

import com.example.ngyenquanghuyyy.entity.EmployeesEntity;

import java.util.List;

public interface EmployeesService {
    List<EmployeesEntity> getAllEmployees ();

    EmployeesEntity createEmployees(EmployeesEntity employees);


}
