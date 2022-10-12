package com.kadyan.Rest_WS_SpringBoot.service;

import com.kadyan.Rest_WS_SpringBoot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getData();

    public Department searchData(Long departmentId);

    public void deleteData(Long departmentId);

    public Department putData(Long departmentId, Department department);

    public Department getDataByNameIgnoreCase(String name);
}
