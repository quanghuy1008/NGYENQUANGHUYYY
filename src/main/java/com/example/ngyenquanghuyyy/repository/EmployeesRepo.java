package com.example.ngyenquanghuyyy.repository;

import com.example.ngyenquanghuyyy.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepo extends JpaRepository<EmployeesEntity, Integer> {

}
