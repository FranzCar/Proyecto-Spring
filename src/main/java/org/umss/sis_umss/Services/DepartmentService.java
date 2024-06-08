package org.umss.SIS_UMSS.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.umss.SIS_UMSS.DTOs.DepartmentDTO;
import org.umss.SIS_UMSS.DTOs.DepartmentMapper;
import org.umss.SIS_UMSS.Repositories.DepartmentRepository;

@Component
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentMapper departmentMapper;

    public DepartmentDTO getDepartment() {
        return null;
    }

    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {
        return null;
    }
}
