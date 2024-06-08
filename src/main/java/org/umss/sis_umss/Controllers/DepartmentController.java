package org.umss.SIS_UMSS.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.umss.SIS_UMSS.DTOs.DepartmentDTO;
import org.umss.SIS_UMSS.Services.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    public DepartmentDTO getDepartments() {
        return departmentService.getDepartment();
    }

    @PostMapping
    public DepartmentDTO create(DepartmentDTO departmentDTO) {
        return departmentService.saveDepartment(departmentDTO);
    }
}
