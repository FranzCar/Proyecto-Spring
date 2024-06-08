package org.umss.SIS_UMSS.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;
import org.umss.SIS_UMSS.DTOs.FacultyDTO;
import org.umss.SIS_UMSS.DTOs.FacultyMapper;
import org.umss.SIS_UMSS.DTOs.UniversityDTO;
import org.umss.SIS_UMSS.DTOs.UniversityMapper;
import org.umss.SIS_UMSS.Exceptions.NotFoundException;
import org.umss.SIS_UMSS.Models.Faculty;
import org.umss.SIS_UMSS.Models.University;
import org.umss.SIS_UMSS.Repositories.FacultyRepository;
import org.umss.SIS_UMSS.Repositories.UniversityRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UniversityService {
    @Autowired
    private UniversityRepository universityRepository;
    @Autowired
    private FacultyRepository facultyRepository;

    @Autowired
    private UniversityMapper universityMapper;
    @Autowired
    private FacultyMapper facultyMapper;

    public List<UniversityDTO> getAllUniversities() {
        return universityRepository.findAll()
                .stream()
                .map(university ->  universityMapper.universityToDTO(university))
                .collect(Collectors.toList());
    }

    public UniversityDTO getUniversity(String uuid) {
        University university = universityRepository.findByUuid(uuid);

        if(university == null) {
             throw new NotFoundException("University", uuid) ;
        }

        return  universityMapper.universityToDTO(university);
    }

    public UniversityDTO saveUniversity(UniversityDTO universityDTO) {
        University university= universityMapper.dtoToUniversity(universityDTO);
        return universityMapper.universityToDTO(universityRepository.save(university));
    }

    public List<FacultyDTO> getFaculties(String universityUuid) {
        University university = universityRepository.findByUuid(universityUuid);

        if(university == null) {
            throw new NotFoundException("University", universityUuid) ;
        }

        List<Faculty> faculties = facultyRepository.findAllByUniversityId(university);

        return faculties
                .stream()
                .map(faculty -> facultyMapper.facultyToDTO(faculty))
                .collect(Collectors.toList());
    }

    public UniversityDTO updateUniversity(UniversityDTO universityDTO) {
        University universityExample = new University(universityDTO.getUuid());
        Optional<University> universityOptional = universityRepository.findOne(Example.of(universityExample));

        if(universityOptional.isEmpty()) {
            throw new NotFoundException("University", universityDTO.getUuid()) ;
        }

        University university = universityOptional.get();
        university.setCode(universityDTO.getCode());
        university.setName(universityDTO.getName());

        universityRepository.save(university);
        return universityMapper.universityToDTO(university);
    }

    public UniversityDTO deleteUniversity(String uuid) {
        University universityExample = new University(uuid);
        Optional<University> universityOptional = universityRepository.findOne(Example.of(universityExample));

        if(universityOptional.isEmpty()){
            throw new NotFoundException("University", uuid) ;
        }

        University university = universityOptional.get();
        universityRepository.delete(university);

        return universityMapper.universityToDTO(university);
    }
}
