package org.umss.SIS_UMSS.DTOs;

import org.springframework.stereotype.Component;
import org.umss.SIS_UMSS.Models.University;

@Component
public class UniversityMapper {
    public UniversityDTO universityToDTO(University university) {
        UniversityDTO universityDTO = new UniversityDTO();
        universityDTO.setUuid(university.getUuid());
        universityDTO.setName(university.getName());
        universityDTO.setCode(university.getCode());
        return universityDTO;
    }

    public University dtoToUniversity(UniversityDTO universityDTO) {
        University university = new University();
        university.setUuid(universityDTO.getUuid());
        university.setName(universityDTO.getName());
        university.setCode(universityDTO.getCode());
        return university;
    }

}
