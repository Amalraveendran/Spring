package com.springBasics.controller;

import com.springBasics.beans.Employee;
import com.springBasics.model.EmployeeDao;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @RequestMapping("/employeeform")
    public String showForm(Model m)
    {
        m.addAttribute("command",new Employee());
        return "employeeform";
    }
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("employee")Employee employee){
        employeeDao.save(employee);
        return "redirect:/view";
    }
    @RequestMapping("/viewemployee")
    public String viewemp(Model m){
        List<Employee> list=employeeDao.getEmployees();
        m.addAttribute("list",list);
        return "viewemployee";
    }


}

