package com.free.cruddemo.controller;

import com.free.cruddemo.dao.EmployeeDao;
import com.free.cruddemo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author free
 * @create 2023-12-25-21:55
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    //查询所以员工返回列表页面
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        //将查到的员工信息放到请求域中
        model.addAttribute("emps",employees);
        return "emp/list";
    }
}
