package org.umss.SIS_UMSS.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.umss.SIS_UMSS.Models.Department;

@Component
public interface DepartmentRepository extends JpaRepository<Department, Integer> {


}
