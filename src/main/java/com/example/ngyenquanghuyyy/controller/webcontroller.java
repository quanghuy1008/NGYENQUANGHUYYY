package com.example.ngyenquanghuyyy.controller;

import com.example.ngyenquanghuyyy.entity.EmployeesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.ngyenquanghuyyy.service.EmployeesService;

import java.util.List;
import java.util.Map;

@Controller
public class webcontroller {
    @Autowired
    EmployeesService employeesService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("msg", "Spring boot + JSP");
        List<EmployeesEntity> employeess = employeesService.getAllEmployees();
        model.addAttribute("employees", employeess);
        return "index";
    }

    @PostMapping("/create")
    public String createProduct(Model model, @RequestParam Map<String, String> param) {
        System.out.println(param);
        String name = param.get("name");
        String wage = param.get("wage");
        EmployeesEntity e = new EmployeesEntity(name, Integer.valueOf(wage));
        employeesService.createEmployees(e);
        return "redirect:/index";
    }
}
