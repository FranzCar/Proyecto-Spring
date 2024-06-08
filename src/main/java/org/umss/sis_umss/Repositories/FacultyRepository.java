package org.umss.SIS_UMSS.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.umss.SIS_UMSS.Models.Faculty;
import org.umss.SIS_UMSS.Models.University;

import java.util.List;

@Component
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

    @Query("SELECT f FROM Faculty f WHERE f.uuid = ?1")
    Faculty findByUuid(String facultyUuid);

    @Query("SELECT f FROM Faculty f WHERE f.university = ?1")
    List<Faculty> findAllByUniversityId(University university);
}
