package com.free.cruddemo.controller;

import com.free.cruddemo.dao.DepartmentDao;
import com.free.cruddemo.dao.EmployeeDao;
import com.free.cruddemo.entities.Department;
import com.free.cruddemo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Collection;

/**
 * @author free
 * @create 2023-12-25-21:55
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;
    //查询所以员工返回列表页面
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        //将查到的员工信息放到请求域中
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    //来到员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){

        //查出所有的部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    //员工添加
    //Springmvc自动将请求参数和入参对象的属性进行一一绑定，属性名必须与请求参数一一对应
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        /*
        * 跳转到员工列表页面
        * redirect：重定向到一个地址
        * forward：转发到一个地址
        * */
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //来到员工修改页面
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        //查出所有的部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        //和添加页面共用
        return "emp/add";
    }

    //员工修改
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        System.out.println(employee);
        return "redirect:/emps";
    }
}
