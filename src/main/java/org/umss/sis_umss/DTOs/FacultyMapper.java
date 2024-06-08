package org.umss.SIS_UMSS.DTOs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.umss.SIS_UMSS.Models.Faculty;
import org.umss.SIS_UMSS.Models.University;

@Component
public class FacultyMapper {
    @Autowired
    private UniversityMapper universityMapper;

    public FacultyDTO facultyToDTO(Faculty faculty) {
        FacultyDTO facultyDTO = new FacultyDTO();
        facultyDTO.setUuid(faculty.getUuid());
        facultyDTO.setName(faculty.getName());
        facultyDTO.setCode(faculty.getCode());
        facultyDTO.setUniversity(universityMapper.universityToDTO(faculty.getUniversity()));

        return facultyDTO;
    }

    public Faculty dtoToFaculty(FacultyDTO facultyDTO, University university) {
        Faculty faculty = new Faculty();
        faculty.setUuid(facultyDTO.getUuid());
        faculty.setName(facultyDTO.getName());
        faculty.setCode(facultyDTO.getCode());
        faculty.setUniversity(university);

        return faculty;
    }
}
