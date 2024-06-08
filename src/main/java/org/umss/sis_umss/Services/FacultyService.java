package org.umss.SIS_UMSS.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.umss.SIS_UMSS.DTOs.FacultyDTO;
import org.umss.SIS_UMSS.DTOs.FacultyMapper;
import org.umss.SIS_UMSS.DTOs.UniversityDTO;
import org.umss.SIS_UMSS.Exceptions.NotFoundException;
import org.umss.SIS_UMSS.Models.Faculty;
import org.umss.SIS_UMSS.Models.University;
import org.umss.SIS_UMSS.Repositories.FacultyRepository;
import org.umss.SIS_UMSS.Repositories.UniversityRepository;

@Component
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    @Autowired
    private UniversityRepository universityRepository;

    @Autowired
    private FacultyMapper facultyMapper;

    public FacultyDTO getFaculty(String facultyUuid) {
        Faculty faculty = facultyRepository.findByUuid(facultyUuid);

        if(faculty == null) {
            throw new NotFoundException("Faculty", facultyUuid);
        }

        return facultyMapper.facultyToDTO(faculty);
    }

    public FacultyDTO saveFaculty(FacultyDTO facultyDTO) {
        UniversityDTO universityDTO = facultyDTO.getUniversity();

        if(universityDTO == null) {
            throw new NotFoundException("University not found", null);
        }

        University university = universityRepository.findByUuid(universityDTO.getUuid());

        if(university == null) {
            throw new NotFoundException("University not found", universityDTO.getUuid());
        }

        Faculty faculty = facultyMapper.dtoToFaculty(facultyDTO, university);
        facultyRepository.save(faculty);

        return facultyMapper.facultyToDTO(faculty);
    }
}
