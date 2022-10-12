package com.kadyan.Rest_WS_SpringBoot.service;

import com.kadyan.Rest_WS_SpringBoot.entity.Department;
import com.kadyan.Rest_WS_SpringBoot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getData() {
        return departmentRepository.findAll();
    }

    @Override
    public Department searchData(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteData(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department putData(Long departmentId, Department department) {
        Department oldData = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getName()) && !"".equalsIgnoreCase(department.getName()))
        {
            oldData.setName(department.getName());
        }
        if(Objects.nonNull(department.getCity()) && !"".equalsIgnoreCase(department.getCity()))
        {
            oldData.setCity(department.getCity());
        }
        if(Objects.nonNull(department.getDepartment()) && !"".equalsIgnoreCase(department.getDepartment()))
        {
            oldData.setDepartment(department.getDepartment());
        }
        if(Objects.nonNull(department.getCode()) && !"".equalsIgnoreCase(department.getCode()))
        {
            oldData.setCode(department.getCode());
        }

        return departmentRepository.findById(departmentId).get();
    }

   @Override
    public Department getDataByNameIgnoreCase(String name) {
        return departmentRepository.getDataByNameIgnoreCase(name);
    }


}
