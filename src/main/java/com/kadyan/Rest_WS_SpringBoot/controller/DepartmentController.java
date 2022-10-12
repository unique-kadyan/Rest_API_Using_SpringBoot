package com.kadyan.Rest_WS_SpringBoot.controller;

import com.kadyan.Rest_WS_SpringBoot.entity.Department;
import com.kadyan.Rest_WS_SpringBoot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
            return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getData(){
        return departmentService.getData();
    }


    @GetMapping("/departments/{id}")
    public Department searchData(@PathVariable("id") Long departmentId)
    {
            return departmentService.searchData(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteData(@PathVariable("id") Long departmentId)
    {
        departmentService.deleteData(departmentId);
        return "Data Deleted having id: "+departmentId;
    }

    @PutMapping("/departments/{id}")
    public Department putData(@PathVariable("id") Long departmentId ,@RequestBody Department department )
    {
        return departmentService.putData(departmentId, department);
    }



    @GetMapping("/departments/name/{name}")
    public  Department getDataByNameNoCase(@PathVariable("name") String name)
    {
        return departmentService.getDataByNameIgnoreCase(name);
    }

}
