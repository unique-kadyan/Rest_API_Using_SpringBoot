package com.kadyan.Rest_WS_SpringBoot.repository;

import com.kadyan.Rest_WS_SpringBoot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department,Long> {


    public Department findByName(String name);

    public Department getDataByNameIgnoreCase(String name);
}
