package org.umss.SIS_UMSS.DTOs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.umss.SIS_UMSS.Models.Department;
import org.umss.SIS_UMSS.Models.Faculty;

@Component
public class DepartmentMapper {
    @Autowired
    private FacultyMapper facultyMapper;

    public DepartmentDTO departmentToDTO(Department department) {
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setUuid(department.getUuid());
        departmentDTO.setName(department.getName());
        departmentDTO.setFacultyDTO(facultyMapper.facultyToDTO(department.getFaculty()));

        return departmentDTO;
    }

    public Department dtoToDepartment(DepartmentDTO departmentDTO, Faculty faculty) {
        Department department = new Department();
        department.setUuid(departmentDTO.getUuid());
        department.setName(departmentDTO.getName());
        department.setCode(departmentDTO.getCode());
        department.setFaculty(faculty);

        return department;
    }

}
