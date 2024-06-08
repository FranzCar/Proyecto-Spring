package org.umss.SIS_UMSS.Controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.umss.SIS_UMSS.DTOs.FacultyDTO;
import org.umss.SIS_UMSS.DTOs.UniversityDTO;
import org.umss.SIS_UMSS.Services.UniversityService;

import java.util.List;

@RestController
@RequestMapping("/universities")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping
    public List<UniversityDTO> getAll(){
        return universityService.getAllUniversities();
    }

    @GetMapping("/{uuid}")
    public UniversityDTO getUniversityById(@PathVariable String uuid){
        return universityService.getUniversity(uuid);
    }

    @PostMapping
    public ResponseEntity<UniversityDTO> create(@Valid @RequestBody UniversityDTO universityDTO){
        UniversityDTO university = universityService.saveUniversity(universityDTO);
        return ResponseEntity.ok().body(university);
    }

    @PutMapping("/{uuid}")
    public UniversityDTO update(@RequestBody UniversityDTO universityDTO){
        return universityService.updateUniversity(universityDTO);
    }

    @DeleteMapping("/{uuid}")
    public UniversityDTO deleteUniversity(@PathVariable String uuid){
        return universityService.deleteUniversity(uuid);
    }

    @GetMapping("/{universityUuid}/faculties")
    public List<FacultyDTO> getFaculties(@PathVariable String universityUuid){
        List<FacultyDTO> facultiesDTOList = this.universityService.getFaculties(universityUuid);

        return facultiesDTOList;
    }
}
