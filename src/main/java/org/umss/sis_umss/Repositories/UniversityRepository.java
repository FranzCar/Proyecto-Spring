package org.umss.SIS_UMSS.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.umss.SIS_UMSS.Models.University;

public interface UniversityRepository extends JpaRepository<University, Integer> {

    @Query("SELECT u FROM University u WHERE u.uuid = ?1")
    University findByUuid(String uuid);

}
